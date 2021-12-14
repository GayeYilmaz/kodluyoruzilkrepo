import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double PI=3.14;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz:");
        double yarıcap = scan.nextDouble();
        System.out.print("Merkez açının çlçüsünü giriniz:");
        double merkezAcı = scan.nextDouble();
        System.out.println("Daire diliminin alanı:"+((PI*(yarıcap*yarıcap)*merkezAcı)/360));








    }
}
