package JavaPatika101;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String [] args){

        final int min = 20;
        final int acilis = 10;
        double ucret, kmFiyat = 2.20;

        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen kac km yol gideceginizi giriniz: ");
        double km = scanner.nextDouble();
        ucret = acilis + (km * kmFiyat);
        if(ucret <= min){
            ucret = 20;
        }
        System.out.print("Borcunuz = "+ucret);


    }
}
