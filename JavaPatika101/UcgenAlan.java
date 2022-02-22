package JavaPatika101;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class UcgenAlan {
    public static void main(String [] args){

        //degiskenleri tanimla
        int a,b,c,cevreYarisi,alan;
        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen sirayla kenar uzunluklarini giriniz: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        cevreYarisi = (a + b + c)/2;
        alan = cevreYarisi * (cevreYarisi - a) * (cevreYarisi - b) * (cevreYarisi - c);
        System.out.print("Ucgenin alani = " + Math.sqrt(alan));

    }
}
