import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double matematik,fizik,kimya,turkce,tarih,muzik;
        Scanner scan=new Scanner(System.in);
        System.out.println("Sırasıyla notlarınızı giriniz:");

        System.out.println("Matematik:");
        matematik=scan.nextDouble();

        System.out.println("Fizik:");
        fizik=scan.nextDouble();

        System.out.println("Kimya:");
        kimya=scan.nextDouble();

        System.out.println("Türkçe:");
        turkce=scan.nextDouble();

        System.out.println("Tarih:");
        tarih=scan.nextDouble();

        System.out.println("Müzik:");
        muzik=scan.nextDouble();

        double ortalama=(matematik+fizik+kimya+turkce+tarih+muzik)/6.0;
        String sonuç=(ortalama>60)?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(sonuç);





    }
}
