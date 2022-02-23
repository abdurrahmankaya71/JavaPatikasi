package JavaPatika101;

public class TersPiramit {
    public static void main(String [] args){
        for(int i=1; i<=10; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=22-(2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
