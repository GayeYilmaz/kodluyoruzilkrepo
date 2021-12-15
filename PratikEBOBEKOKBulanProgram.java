import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ebob=0,num1,num2;
        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        num1 = scan.nextInt();

        System.out.print("2. sayıyı giriniz:");
        num2 = scan.nextInt();

        int ekok=num1*num2;

        int sınır=0;
        int i=1;
        if(num1>num2){
           sınır=num2;
        }else{
            sınır=num1;
        }

        while(i<=sınır){
            if(num1%i==0 && num2%i==0 && i>ebob){
                ebob=i;
            }
            i++;
        }
        int j=1;
        while(j<=(num1*num2)){
            if(j%num1==0 && j%num2==0 ){
                ekok=j;
                break;
            }
            j++;
        }
        System.out.println("EBOB:"+ebob);
        System.out.println("EKOK:"+ekok);

    }
}
