
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int yıl;
        Scanner scan = new Scanner(System.in);

        System.out.print("Yılı Giriniz:");

        yıl = scan.nextInt();
        if(yıl%100==0){
            if(yıl%400==0){
                System.out.println(yıl+" bir artık yıldır!");
            }else{
                System.out.println(yıl+" bir artık yıl değildir!");
            }

        }else{
            if(yıl%4==0){
                System.out.println(yıl+" bir artık yıldır!");
            }
            else{
                System.out.println(yıl+" bir artık yıl değildir!");
            }
        }




    }
}
