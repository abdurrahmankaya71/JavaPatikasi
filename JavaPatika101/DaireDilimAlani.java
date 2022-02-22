package JavaPatika101;

import java.util.Scanner;

public class DaireDilimAlani {
    public static void main(String [] args){
        final double pi = 3.14;
        int a; // alpha merkizi aci
        int r; // yari cap
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen a merkezi aci degerini giriniz: ");
        a = scanner.nextInt();
        System.out.print("Lutfen r yaricap degerini giriniz: ");
        r = scanner.nextInt();
        double alan = pi * r * r * a /360;
        System.out.print("Girdiginiz degerlere sahip dairenin alani : " + alan);
    }
}
