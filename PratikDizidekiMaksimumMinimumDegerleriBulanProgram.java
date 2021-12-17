import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        System.out.println("Dizi : "+Arrays.toString(list));
        Scanner scan = new Scanner(System.in);
        System.out.print("Girilen Sayı Sayı :");
        int num=scan.nextInt();

        Arrays.sort(list);
        int index = Arrays.binarySearch(list,num);

        System.out.println("Girilen sayıdan küçük en yakın sayı : "+list[index-1]);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+list[index+1]);




    }

}
