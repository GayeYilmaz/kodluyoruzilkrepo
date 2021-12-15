import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num,count=0,sum=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayıyı giriniz:");

        num = scan.nextInt();
        for(int i=0;i<=num;i++){
            if(i%3==0 && i%4==0){
                sum+=i;
                count+=1;
            }
        }
        System.out.println("Ortalama:"+(sum/count));




    }
}
