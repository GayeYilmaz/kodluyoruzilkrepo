import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class Main {
    public static void main(String[] args) {

        int enbüyük=0,num1,num2;
        int enkücük=MAX_VALUE;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        num1 = scan.nextInt();

        for(int i=1;i<=num1;i++){
            System.out.print(i + ". sayı:");
            num2=scan.nextInt();
            if(num2>enbüyük){
                enbüyük=num2;
            }
            if(num2<enkücük){
                enkücük=num2;
            }
        }

        System.out.println("En büyük sayı:"+enbüyük);
        System.out.print("En küçük sayı:"+enkücük);


    }
}
