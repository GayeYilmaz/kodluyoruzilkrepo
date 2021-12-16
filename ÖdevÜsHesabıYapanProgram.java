import java.util.Scanner;

public class Main{
    static int üsAlma(int a, int b){
        if(b==1){
            return a;
        }
        if(b==0){
            return 1;
        }
        return (a * üsAlma(a,b-1));



    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int a = scan.nextInt();

        System.out.print("Üs değerini giriniz : ");
        int b = scan.nextInt();

        System.out.println(üsAlma(a,b));



    }
}
