package JavaPatika101;

// C(n,r) = n! / (r! * (n-r)!) bu bizim kombinasyon formulu

import java.util.Scanner;

public class KombinasyonForm {

    // faktoriyel fonksiyonu
    static int fact(int a){
        int factoriyel = 1;
        for(int i=1; i<=a; i++){
            factoriyel *= i;
        }
        return factoriyel;
    }


    public static void main(String [] args){
        int n,r,kombinasyon;
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Lutfen eleman sayisini girniz n = ");
        n = scanner.nextInt();
        System.out.print("Lutfen secim sayisi giriniz r = ");
        r = scanner.nextInt();

        if (r>n){
            System.err.println("n > r veya n ve r esit olmali");
        }
        else
        {
            kombinasyon = fact(n) / (fact(r) * fact(n-r));
            System.out.println("C(n,r) = "+kombinasyon);
        }
    }
}
