package JavaPatika101;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int n;
        double toplam = 0.0;
        System.out.print("Lutfen pozitif tamsayi giriniz: ");
        n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            toplam += (1.0/i);
        }
        System.out.print("Serinin toplami = " +toplam);


    }
}
