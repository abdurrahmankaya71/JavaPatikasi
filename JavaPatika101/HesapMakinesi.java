package JavaPatika101;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String [] args){
        int n1,n2,secim,sonuc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sirayla islem yapmak istedigininz sayilari giriniz ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        System.out.print("Bu sayilari toplamk istiyorsaniz 1, cikarmak istiyorsaniz 2," +
                " carpmak istiyorsaniz 3, bolmek istiyorsaniz 4 basiniz: ");
        secim = scanner.nextInt();
        switch (secim){
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Hatali secim yaptiniz");
        }
    }
}
