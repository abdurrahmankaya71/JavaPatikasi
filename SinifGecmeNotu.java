package JavaPatika101;

import java.util.Scanner;

public class SinifGecmeNotu {
    public static void main(String [] args){
        int matematik,fizik,kimya,turkce,muzik,ortalama;

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

        System.out.print("lutfen muzik notunuzu giriniz: ");
        muzik = scanner.nextInt();

        // bu ifler notlar aralikta degilse ortalamaya girmesin diye
        if(matematik>100 || matematik<0){
            matematik = 0;
        }
        if(fizik>100 || fizik<0){
            fizik = 0;
        }
        if(kimya>100 || kimya<0){
            kimya = 0;
        }
        if(turkce>100 || turkce<0){
            turkce = 0;
        }
        if(muzik>100 || muzik<0){
            muzik = 0;
        }

        ortalama = (matematik + fizik + kimya + turkce + muzik)/5;
        System.out.println("Ortalamaniz: " + ortalama);

        if(ortalama<55){
            System.out.println("Kaldiniz");
        }else{
            System.out.println("Tebrikler, Gectiniz");
        }
    }
}
