
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        double count=0.0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayıyı giririniz:");
        n=scan.nextInt();
        for(int i=1;i<=n;i++){
            count=count+(1.0/i);
        }
        System.out.println("Sonuç:"+count);


    }

}
