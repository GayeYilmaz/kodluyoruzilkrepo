
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Dik kenarlardan birini uzunluğu:");
        double a = scan.nextDouble();
        System.out.print("Dik kenarlardan diğerinin uzunluğu:");
        double b = scan.nextDouble();
        double ckare=(a*a)+(b*b);
        System.out.println("Dik olmayan kenarın uzunluğu ="+Math.sqrt(ckare));






    }
}
