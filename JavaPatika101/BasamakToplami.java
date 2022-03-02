package JavaPatika101;

import java.util.Scanner;

public class BasamakToplami {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int sayi, toplam = 0;
        System.out.print("Lutfen bir sayi giriniz: ");
        sayi = scanner.nextInt();

        while(sayi>0){
            toplam += sayi%10;
            sayi = sayi/10;
        }
        System.out.println("Girdiginiz sayinin basamaklar toplami = " +toplam);




    }
}
