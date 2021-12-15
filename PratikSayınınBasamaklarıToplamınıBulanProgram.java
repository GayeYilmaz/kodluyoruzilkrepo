import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n,count=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayıyı gririniz:");
        n=scan.nextInt();
        while(n%10>0){
            count+=(n%10);
            n=n/10;
            
        }

        System.out.println("Basamakları toplamı:"+count);


    }

}
