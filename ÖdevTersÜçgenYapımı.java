import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1,count=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        num1 = scan.nextInt();

        for(int i=num1;i>=1;i--){
            for(int j=1;j<=num1-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(i-1)*2+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
