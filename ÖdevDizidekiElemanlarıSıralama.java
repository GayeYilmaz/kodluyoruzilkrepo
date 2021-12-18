import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n =  scan.nextInt();
        System.out.println("Dizinin elemanlarını giriniz :");
        int numbers [] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print((i+1)+". Eleman : ");
            numbers[i] = scan.nextInt();

        }
        Arrays.sort(numbers);

        System.out.println("Sıralama : "+Arrays.toString(numbers));



    }

}
