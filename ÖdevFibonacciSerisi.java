import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fibon1=0,fibon2=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Eleman sayısı:");
        int num=scan.nextInt();

        for(int i=0;i<=num;i++){
            if(i==0 ){
                System.out.print(i+" ");
                fibon2=0;
            }
           else if(i==1){
                System.out.print(i+" ");
                fibon1=1;
            }
            else{
                System.out.print((fibon1+fibon2)+" ");
                int x=fibon2;
                fibon2=fibon1;
                fibon1=fibon1+x;

            }

        }

        }

    }
