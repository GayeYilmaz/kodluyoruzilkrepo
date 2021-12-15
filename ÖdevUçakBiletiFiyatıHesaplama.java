import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int km,yas,tip;
        double ucret,kmUcret=0.10;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kilometreyi giriniz:");
        km = scan.nextInt();

        System.out.print("Yaşınızı giriniz:");
        yas = scan.nextInt();


        System.out.print("Yolculuk tek yön ise 1'e,gidiş-dönüş ise 2'e basınız:");
        tip=scan.nextInt();
        if((tip!=1 && tip!=2) || yas<0 || km<0 ){
            System.out.println("Hatalı Veri Girdiniz!");

        }else{
            ucret=km*kmUcret;
            if(yas<12){
                ucret=ucret/2;
            }
            else if(yas>=12 && yas<24){
                ucret=ucret-(ucret*0.1);
            }
            else if(yas>=65){
                ucret=ucret-(ucret*0.3);
            }

            if(tip==2){
                ucret=ucret-(ucret*0.2);
                ucret=ucret*2;
            }
            System.out.println("Toplma Tutar:"+ucret);

        }


    }
}
