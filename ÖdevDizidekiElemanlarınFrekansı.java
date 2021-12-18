import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int numbers [] = {10,20,20,10,10,20,5,20};

        System.out.println("Dizi : "+Arrays.toString(numbers));
        int freq = 0;
        System.out.println("Tekrar Sayıları" );
        for(int i=0;i<numbers.length;i++){
            for(int j = 0;j<numbers.length;j++){
                if(numbers[i]!=0){
                    if(numbers[i]==numbers[j] && i==j ){
                        freq+=1;
                    }
                    if(numbers[i]==numbers[j] && i!=j ){

                        freq+=1;
                        numbers[j]=0;

                    }

                }



            }
            if(freq>0){
                System.out.println(numbers[i]+" sayısı "+(freq)+" tekrar edildi.");
                numbers[i]=0;

            }
            freq=0;




           }

        }






    }
