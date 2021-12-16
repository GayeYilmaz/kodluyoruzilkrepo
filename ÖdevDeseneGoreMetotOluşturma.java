import java.util.Scanner;

public class Main{
    static void desen(int a,int b,boolean x){

        if(x==false){
            if(a<=0){

                System.out.print(a+" ");
                a+=5;
                desen(a,b,true);
            }
            else{

                System.out.print(a+" ");
                 a-=5;
                 desen(a,b,false);
            }
        }else{
            if(a==b){

                System.out.print(a+" ");




            }
            else{

                System.out.print(a+" ");
                a+=5;
                desen(a,b,true);

            }
        }





    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Değeri giriniz : ");
        int a = scan.nextInt();
        boolean x=false;
        desen(a,a,x);



    }
}
