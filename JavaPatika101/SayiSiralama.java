package JavaPatika101;

import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {        
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen siralamak istediginiz sayilari giriniz");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + "," + b + "," + c);
            } else if (c > b) {
                System.out.println(a + "," + c + "," + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + "," + a + "," + c);
            } else if (c > a) {
                System.out.println(b + "," + c + "," + a);
            }
        } else if (c > a && c > b) {
            if (a > c) {
                System.out.println(c + "," + a + "," + b);
            } else if (b > a) {
                System.out.println(c + "," + b + "," + a);
            }
        } else{
            System.out.println("Sayilar birbirine esit");
        }
    }
}
