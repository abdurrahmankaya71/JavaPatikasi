package JavaPatika101;

import java.util.Scanner;

public class SicaklikProgram {
    public static void main(String [] args){

        int sicaklik;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Program onermemiz icin sicakligi giriniz: ");
        sicaklik = scanner.nextInt();
        
        if(sicaklik<5){
            System.out.println("Kayak yapmanizi oneriyoruz");
        }else if(sicaklik>5 && sicaklik<15){
            System.out.println("Sinemeya gitmenizi oneriyoruz");
        }else if(sicaklik>15 && sicaklik<25){
            System.out.println("Piknik yapmanizi oneriyoruz");
        }else{
            System.out.println("Yuzme yapmanizi oneriyoruz");
        }
    }
}
