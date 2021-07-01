import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yaş, yolculukTipi;
        double normalTutar, yaşİndirimi, indirimliTutar, gidişDönüşBiletİndirimi, toplamTutar;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = scanner.nextInt();


        System.out.print("Yaşınızı giriniz : ");
        yaş = scanner.nextInt();


        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = scanner.nextInt();

        if (mesafe <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else if (yaş <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else if (yolculukTipi != 1 && yolculukTipi != 2) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            normalTutar = mesafe * 0.1d;

            if (yaş < 12) {
                yaşİndirimi = normalTutar * 0.5d;
            } else if (yaş <= 24) {
                yaşİndirimi = normalTutar * 0.1d;
            } else if (yaş > 65) {
                yaşİndirimi = normalTutar * 0.3d;
            } else {
                yaşİndirimi = 0;
            }

            indirimliTutar = normalTutar - yaşİndirimi;

            if (yolculukTipi == 2) {
                gidişDönüşBiletİndirimi = indirimliTutar * 0.2d;
            } else {
                gidişDönüşBiletİndirimi = 0;
            }

            toplamTutar = (indirimliTutar - gidişDönüşBiletİndirimi) * yolculukTipi;

            System.out.println("Toplam tutar = " + toplamTutar + " TL");

        }

    }
}
