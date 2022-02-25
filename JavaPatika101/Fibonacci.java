package JavaPatika101;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.print("Fibonacci serisinin eleman sayisini giriniz: ");
        input = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print("0 1 "); // ilk iki sayi hep yazilsin diye
        for(int i=1; i<=input-2; i++){
            c = a+b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
}
