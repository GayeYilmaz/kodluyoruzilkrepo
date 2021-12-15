import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1,n2,n3;

        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayı:");
        n1 =scan.nextInt();
        System.out.print("2. sayı:");
        n2 =scan.nextInt();
        System.out.print("3. sayı:");
        n3 =scan.nextInt();
        int smallest=0;
        if(n1<n2 && n1<n3){
            System.out.println(n1);
            if(n2<n3){
                System.out.println(n2);
                System.out.println(n3);
            }else{
                System.out.println(n3);
                System.out.println(n2);
            }
        }
        if(n1>n2 && n2<n3){
            System.out.println(n2);
            if(n1<n3){
                System.out.println(n1);
                System.out.println(n3);
            }else{
                System.out.println(n3);
                System.out.println(n1);
            }
        }
        if(n3<n2 && n1>n3){
            System.out.println(n3);
            if(n2<n1){
                System.out.println(n2);
                System.out.println(n1);
            }else{
                System.out.println(n1);
                System.out.println(n2);
            }
        }





    }
}
