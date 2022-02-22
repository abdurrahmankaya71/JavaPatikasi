package JavaPatika101;

import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {
	// degiskenleri tanimla
        int matematik,fizik,kimya,turkce,tarih,muzik;

        // kullanicidan degerleri al
        Scanner scanner = new Scanner(System.in);

        System.out.print("lutfen matematik notunuzu giriniz: ");
        matematik = scanner.nextInt();

        System.out.print("lutfen fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();

        System.out.print("lutfen kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();

        System.out.print("lutfen turkce notunuzu giriniz: ");
        turkce = scanner.nextInt();

        System.out.print("lutfen tarih notunuzu giriniz: ");
        tarih = scanner.nextInt();

        System.out.print("lutfen muzik notunuzu giriniz: ");
        muzik = scanner.nextInt();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik)/6;

        String durum = ortalama >= 60 ? "Gectiniz" : "Kaldiniz";

        System.out.println("Ortalamaniz: " + ortalama);
        System.out.println("Durumunuz: " + durum);
        }
}
