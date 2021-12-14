import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double armutKilosu=2.14,elmaKilosu=3.67,domatesKilosu=1.11,muzKilosu=0.95,patlıcanKilosu=5.00;
        Scanner scan = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        double armutKilo = scan.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elmaKilo = scan.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domatesKilo = scan.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muzKilo = scan.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double apatlıcanKilo = scan.nextDouble();

        System.out.print("Toplam Tutar : " +(armutKilo*armutKilosu+elmaKilo*elmaKilosu+domatesKilo*domatesKilosu+muzKilo*muzKilosu+apatlıcanKilo*patlıcanKilosu));




    }
}
