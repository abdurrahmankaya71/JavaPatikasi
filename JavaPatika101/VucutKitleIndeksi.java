package JavaPatika101;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String [] args){
        double kilo,boy,indeks;
        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen boyunuzu metre cinsinden giriniz: ");
        boy = scanner.nextDouble();
        System.out.print("lutfen kilonuzu kg cindinden giriniz: ");
        kilo = scanner.nextDouble();
        indeks = kilo/(boy*boy);
        System.out.println("vucut kitle indeksiniz: " +indeks);

    }
}
