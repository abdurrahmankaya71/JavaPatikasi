package JavaPatika101;

import java.util.Scanner;

public class RecursiveUs {
    static int usAlma(int a, int b){
        if(a == 1 || b == 0)
            return 1;
        return a * usAlma(a,b-1);
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int taban,us;
        System.out.print("Taban degerini giriniz: ");
        taban = scanner.nextInt();
        System.out.print("Us degerini giriniz: ");
        us = scanner.nextInt();
        System.out.println("Sonuc = "+usAlma(taban,us));
    }
}
