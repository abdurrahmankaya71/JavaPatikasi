package JavaPatika101;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String [] args){
        int taban,us,sayi = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban olacak sayiyi giriniz : ");
        taban = scanner.nextInt();
        System.out.print("Us olacak sayiyi giriniz : ");
        us = scanner.nextInt();

        for(int i=1; i<=us; i++){
            sayi *=taban;
        }
        System.out.print("Sonuc = " + sayi);
    }
}
