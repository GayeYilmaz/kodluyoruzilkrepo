import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1,count=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        num1 = scan.nextInt();

        for(int i=1;i<num1;i++){
            if(num1%i==0){
                count+=i;
            }
        }
        if(count==num1){
            System.out.println(num1+" Mükemmel sayıdır");
        }else{
            System.out.println(num1+" Mükemmel sayı değildir");
        }



    }
}
