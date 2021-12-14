
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Ürün fiyatını giriniz:");
        double fiyat = scan.nextDouble();
        System.out.println("KDV'siz Fiyat="+fiyat);
        double kdv = (fiyat>0 && fiyat<=1000) ? 0.18:0.8;
        System.out.println("KDV'li Fiyat="+(fiyat+fiyat*kdv));
        System.out.println("KDV tutarı="+(fiyat*kdv));





    }
}
