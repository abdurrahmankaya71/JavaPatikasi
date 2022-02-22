package JavaPatika101;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String [] args){

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        double miktar,toplam = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut kac kilo ? : ");
        miktar = scanner.nextDouble();
        toplam = miktar*armut;

        System.out.print("Elma kac kilo ? : ");
        miktar = scanner.nextDouble();
        toplam += miktar*elma;

        System.out.print("Domates kac kilo ? : ");
        miktar = scanner.nextDouble();
        toplam += miktar*domates;

        System.out.print("Muz kac kilo ? : ");
        miktar = scanner.nextDouble();
        toplam += miktar*muz;

        System.out.print("Patlican kac kilo ? : ");
        miktar = scanner.nextDouble();
        toplam += miktar*patlican;

        System.out.println("Toplam Tutar : "+toplam);
    }
}
