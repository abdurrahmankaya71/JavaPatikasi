package JavaPatika101;

public class Elmas {
    public static void main(String [] args){
        for (int i=1; i <= 9; i++){
            if(i<=5) {
                for (int j = 5; j >= i + 1; j--) {
                    System.out.print(" ");
                }
                for(int k=1; k<=2*i-1; k++){
                    System.out.print("*");
                }
            }else{
                for (int j = 5; j <= i-1 ; j++) {
                    System.out.print(" ");
                }
                for (int a = 1; a<=19-2*i; a++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
