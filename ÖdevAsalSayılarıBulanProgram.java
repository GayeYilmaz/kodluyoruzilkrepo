public class Main {
    public static void main(String[] args) {


        for(int i=2;i<=100;i++){

            if(i==2){
                System.out.print(i+" ");
            }else{
                boolean asalMı=true;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        asalMı=false;
                        break;
                    }
                }
                if(asalMı){
                    System.out.print(i+" ");
                }

            }



            }


        }




    }
