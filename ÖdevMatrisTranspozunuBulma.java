public class Main {
    public static void main(String[] args) {
        int a [][] = {{1,2,3},
                      {4,5,6}};

        int b [][] = new int[a[1].length][a.length];
        System.out.println();
        for(int i=0;i<a[1].length;i++){
            for(int j=0;j<a.length;j++){
                b[i][j]=a[j][i];
            }
        }


        System.out.println("Printing Matrix without transpose:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[1].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();//new line
        }
        System.out.println("Printing Matrix After Transpose:");
        for(int i=0;i<a[1].length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();//new line
        }






    }

        }
