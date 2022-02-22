package JavaPatika101;
import java.util.Scanner;

public class CinZoydagi {
    public static void main(String [] args){
        int dogum;
        String cinZoydagi = null;
        Scanner scn = new Scanner(System.in);
        System.out.print("Dogum tarihinizi giriniz : ");
        dogum = scn.nextInt();

        switch (dogum%12){
            case 0:
                cinZoydagi = "Maymun";
                break;
            case 1:
                cinZoydagi = "Horoz";
                break;
            case 2:
                cinZoydagi = "Kopek";
                break;
            case 3:
                cinZoydagi = "Domuz";
                break;
            case 4:
                cinZoydagi = "Fare";
                break;
            case 5:
                cinZoydagi = "Okuz";
                break;
            case 6:
                cinZoydagi = "Kaplan";
                break;
            case 7:
                cinZoydagi = "Tavsan";
                break;
            case 8:
                cinZoydagi = "Ejderha";
                break;
            case 9:
                cinZoydagi = "Yilan";
                break;
            case 10:
                cinZoydagi = "At";
                break;
            case 11:
                cinZoydagi = "Koyun";
                break;
        }
        System.out.print("Cin zoydagi burcunuz : " + cinZoydagi);
    }
}
