
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {

        int n,r,result=1;
        Scanner scan = new Scanner(System.in);

        System.out.print("n^r hesaplamak için n değerini girirniz:");
        n = scan.nextInt();

        System.out.print("n^r hesaplamak için r değerini girirniz:");
        r = scan.nextInt();

        for(int i=1;i<=r;i++){
            result=result*n;
        }
        System.out.println(n+"^"+r+"="+result);
        

    }

}
