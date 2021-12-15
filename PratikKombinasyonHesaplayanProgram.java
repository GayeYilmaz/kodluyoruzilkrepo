import java.util.Scanner;

public class Main {
    public static int faktoriyel(int num){
        int result;
        if(num==0 || num==1){
            return 1;
        }
        result=num*faktoriyel(num-1);
        return result;
    }

    public static void main(String[] args) {

        int n,r;
        Scanner scan = new Scanner(System.in);

        System.out.print("C(n,r) kombinasyonunu hesaplamak için n değerini girirniz:");
        n = scan.nextInt();

        System.out.print("C(n,r) kombinasyonunu hesaplamak için r değerini girirniz:");
        r = scan.nextInt();

        System.out.println("Kombinasyon :"+(faktoriyel(n)/(faktoriyel(r)*faktoriyel(n-r))));







    }

}
