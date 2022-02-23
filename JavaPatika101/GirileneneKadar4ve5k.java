package JavaPatika101;

import java.util.Scanner;

public class GirileneneKadar4ve5k {
    public static void main(String [] args){
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen sayi giriniz: ");
        input = scanner.nextInt();
        for(int i=0; i<=input; i++){
            if(i%4 == 0 || i%5 == 0){
                System.out.println(i);
            }
        }
    }
}
