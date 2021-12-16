import java.util.Scanner;

public class Main{
    static boolean asalMı(int a,int b){
        boolean result=true;
        if(b==a){
            return true;
        }
        if(a==2){
             result=true;
        }
        if(a%b==0){
            result =false;
        }
        return (asalMı(a,b+1)&&result);



    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Değeri giriniz : ");
        int a = scan.nextInt();
        int b=2;


        System.out.println((asalMı(a,b)==true)?"Asal":"Asal Değil");



    }
}
