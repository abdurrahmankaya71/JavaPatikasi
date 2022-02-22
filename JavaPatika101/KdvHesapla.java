package JavaPatika101;

import java.util.Scanner;

public class KdvHesapla {
    public static void main(String [] args){
        double tutar,kdvliTutar;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen tutari giriniz: ");
        tutar = scanner.nextDouble();
        if(tutar<=1000){
            kdvliTutar = tutar + (tutar * 0.18);
        }else {
            kdvliTutar = tutar + (tutar * 0.08);
        }
        System.out.print("Girdiginiz tutarin KDV eklenmis hali : " + kdvliTutar);
    }
}
