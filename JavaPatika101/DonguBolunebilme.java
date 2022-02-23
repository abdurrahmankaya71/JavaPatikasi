package JavaPatika101;
import java.util.Scanner;

public class DonguBolunebilme {
    public static void main(String [] args){
        int input;
        int toplam = 0;
        System.out.print("Lutfen hangi sayiya kadar kontrol yapmak istediginizi giriniz: ");
        Scanner scn = new Scanner(System.in);
        input = scn.nextInt();
        for(int i=0; i<=input; i++){
            if(i%12 == 0){
                toplam += i;
            }
        }
        System.out.println("3 ve 4'e tam bolunen sayilarin toplami = "+toplam);
    }
}
