import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz:");
        double boy = scan.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        double kilo = scan.nextDouble();

        System.out.println("Vücut kitle indexsiniz :"+(kilo/(boy*boy)));
        

    }
}
