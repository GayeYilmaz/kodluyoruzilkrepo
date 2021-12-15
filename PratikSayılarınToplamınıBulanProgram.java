import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num,sum=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayıyı giriniz:");

        num = scan.nextInt();
        while(num%2==0){
            if(num%4==0){
                sum+=num;
            }
            System.out.print("Sayıyı giriniz:");
            num = scan.nextInt();

        }

        System.out.println("Toplam:"+sum);




    }
}
