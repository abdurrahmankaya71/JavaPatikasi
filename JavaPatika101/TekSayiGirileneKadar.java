package JavaPatika101;
import java.util.Scanner;

/*   Java döngüler ile tek bir sayı girilene kadar kullanıcıdan
     girişleri kabul eden ve girilen değerlerden çift ve 4'ün
     katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/
public class TekSayiGirileneKadar {
    public static void main(String [] args){
        int toplam = 0;
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen porgrami sonlandirmak istiyorsaniz tek sayi giriniz");

        while(input%2==0){
            System.out.print("sayi giriniz: ");
            input = scanner.nextInt();
            if(input%4 == 0){
                toplam += input;
            }
        }
        System.out.print("4'un kati olan sayilarin toplami = "+toplam);
    }
}
