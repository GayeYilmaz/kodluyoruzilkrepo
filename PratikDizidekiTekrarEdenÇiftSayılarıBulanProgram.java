import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbers[] = {1,1,3,3,0,0,0,0,4,4,5,5,5,6,8,7,2,2};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        for(int i = 0;i<numbers.length;i++){
            if(i==numbers.length-1){

            }
            else if(i!=0 && numbers[i] == numbers[i+1] && numbers[i]%2==0 && numbers[i]!=numbers[i-1] ){
                System.out.println(numbers[i]);
            }
            else if(i==0 && numbers[i] == numbers[i+1] && numbers[i]%2==0 ){
                System.out.println(numbers[i]);
            }

        }



    }

}
