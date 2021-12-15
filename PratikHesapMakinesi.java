import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scan = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        int n1 = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        int n2 = scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz:");
        int select = scan.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam : "+(n1+n2));break;
            case 2:
                System.out.println("Çıkarma : "+(n1-n2));break;
            case 3:
                System.out.println("Çarpma : "+(n1*n2));break;
            case 4:
                if(n2!=0){
                    System.out.println("Bölme : "+(n1/n2));
                }else{
                    System.out.println("Bir sayı 0'a bölünemez");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar seçiniz.");

        }




    }
}
