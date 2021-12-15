
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double matematik,fizik,kimya,turkce,muzik;
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

        System.out.println("Müzik:");
        muzik=scan.nextDouble();
        if(matematik<0 && matematik>100){
            matematik=0;
        }
        if(turkce<0 && turkce>100){
            turkce=0;
        }
        if(muzik<0 && muzik>100){
            muzik=0;
        }
        if(kimya<0 && kimya>100){
            kimya=0;
        }
        if(fizik<0 && fizik>100){
            fizik=0;
        }

        double ortalama=(matematik+fizik+kimya+turkce+muzik)/5.0;
        String sonuç=(ortalama>55)?"Tebrikler sınıfı geçtiniz !":"Sınıfta kaldınız sneye tekrar görüşmek üzere!";
        System.out.println(sonuç);
        System.out.println("Ortolamanız:"+ortalama);






    }
}
