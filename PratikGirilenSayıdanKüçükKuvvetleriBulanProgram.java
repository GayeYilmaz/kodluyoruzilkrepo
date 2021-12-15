
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sınır;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sınırı giriniz:");

        sınır = scan.nextInt();
       for(int i=1 ,j=1;i<sınır & j<sınır;i*=4,j*=5){
           System.out.println(i);
           System.out.println(j);
       }






    }
}
