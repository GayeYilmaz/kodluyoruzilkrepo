
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("1. kenarın uzunluğu:");
        double a = scan.nextDouble();
        System.out.print("2. kenarın uzunluğu:");
        double b = scan.nextDouble();
        System.out.print("3. kenarın uzunluğu:");
        double c = scan.nextDouble();
        double u=(a+b+c)/2;
        System.out.println("Üçgenin alanı ="+Math.sqrt(u*(u-a)*(u-b)*(u-c)));







    }
}
