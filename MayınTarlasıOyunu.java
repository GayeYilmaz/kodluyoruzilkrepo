import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.println(MeinSwepper.starter()==false ?"Mayına bastın!":"Kazandın!");

    }
}
class MeinSwepper {
    public static boolean starter() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz : ");
        int row = scan.nextInt();

        System.out.print("Sütun sayısını giriniz : ");
        int column = scan.nextInt();

        char tarla [][] = new char[row][column];
        char newTarla [][] = new char[row][column];
        fillTarla(row,column,tarla);
        fillTarla(row,column,newTarla);

        int mayınSayısı = (row*column)/4;

        for(int sayı=1;sayı<=mayınSayısı;sayı++){
            int mayınRow =(int) (Math.random()*(row));
            int mayınColumn =(int)(Math.random()*(column));
            if(tarla[mayınRow][mayınColumn]=='*'){
                sayı-=1;
            }else{
                tarla[mayınRow][mayınColumn]='*';
            }
        }
        int nokta=(row*column)-mayınSayısı;
        boolean win= true;
        boolean goOn = true;
        showTarla(row,column,tarla);
        System.out.println("----------------------------");
        while(goOn){
            showTarla(row,column,newTarla);
            System.out.print("Satır numarasını giriniz : ");
            int rowNo = scan.nextInt();

            System.out.print("Sütün numarasını giriniz : ");
            int columnNo = scan.nextInt();


            if(control(rowNo,columnNo,row,column)==false){

                System.out.println("Değerler doğru aralıkta değil. 0<= satır< "+row +" ve 0<= sütun< "+column+" olmalı.");
                continue;
            }
            if (tarla[rowNo][columnNo]=='*') {
                win = false;
                goOn = false;
                break;

            }else{
                if(newTarla[rowNo][columnNo]==' '){
                    int sayıx = MeinSwepper.mayınArama(row,column,rowNo,columnNo,tarla);

                    char x = Character.forDigit(sayıx,10);
                    newTarla[rowNo][columnNo]=x;
                    nokta-=1;

                }



            }
            if(nokta==0){
                win=true;
                goOn=false;
                break;
            }



        }
        return win;


    }
    public static boolean control(int rowNo,int columnNo,int row,int column){


        boolean rowResult=true;
        boolean columnResult=true;
        if(rowNo<row && rowNo>=0){


        }else{
            rowResult=false;
        }

        if(columnNo<column && columnNo>=0){


        }else{
            columnResult=false;
        }
        boolean result =(rowResult & columnResult);

        return result;
    }
    public static int mayınArama(int row,int column,int rowNo,int columnNo,char tarla[][]){
        int mayınSayısı=0;
        if(rowNo+1<row ){
            if(tarla[rowNo+1][columnNo]=='*'){
                mayınSayısı+=1;
            }

        }
        if(columnNo+1<column ){
            if(tarla[rowNo][columnNo+1]=='*'){
                mayınSayısı+=1;
            }
        }
        if(rowNo+1<row && columnNo+1<column ){
            if(tarla[rowNo+1][columnNo+1]=='*'){
                mayınSayısı+=1;
            }

        }
        if(columnNo-1>=0 ){
            if(tarla[rowNo][columnNo-1]=='*'){
                mayınSayısı+=1;
            }

        }
        if(columnNo-1>=0 && rowNo-1>=0 ){
            if(tarla[rowNo-1][columnNo-1]=='*'){
                mayınSayısı+=1;
            }

        }
        if(rowNo-1>=0 ){
            if(tarla[rowNo-1][columnNo]=='*'){
                mayınSayısı+=1;
            }
        }

        if(columnNo+1<column && rowNo-1>=0 ){
            if(tarla[rowNo-1][columnNo+1]=='*'){
                mayınSayısı+=1;
            }
        }
        if(columnNo-1>=0 && rowNo+1<row ){
            if(tarla[rowNo+1][columnNo-1]=='*'){
                mayınSayısı+=1;
            }

        }


        return mayınSayısı;
    }
    public static void fillTarla(int row,int column,char tarla[][]){
        for(int i =0;i<row;i++){
            for(int j=0;j<column;j++){
                tarla[i][j]=' ';
            }

        }
    }

    public static void showTarla(int row,int column,char tarla[][]){
        for(int i =0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("[ "+tarla[i][j]+" ]  ");
            }
            System.out.println();
        }
    }

}







