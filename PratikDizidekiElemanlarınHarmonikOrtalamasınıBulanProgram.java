public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        double harmon = 0.0;
        for (int i = 0; i <numbers.length; i++) {
           harmon = harmon + (1/(double)numbers[i]);

        }

        System.out.println( numbers.length/harmon);




    }

}
