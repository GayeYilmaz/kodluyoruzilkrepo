import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        String userName,password;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        userName=scan.nextLine();

        System.out.print("Sifreniz:");
        password=scan.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız !");
        }else{
            if(!userName.equals("patika") && password.equals("java123")){
                System.out.println("Bilgileriniz Yanlış !");
            }
            else if(userName.equals("patika") && !password.equals("java123")){
                System.out.println("Sifreniz Yanlış. Şifrenizi sıfırlamak istiyorsanız 1'e istemiyorsanız 0'a basın.");
                 int yesOrNot=scan.nextInt();
                 if(yesOrNot==1){
                     System.out.println("Yeni şifrenizi giriniz.");
                     String newPassword=scan.next();

                     if(newPassword.equals("java123")){
                         System.out.println("Şifre oluşturulamadı, ütfen başka şifre giriniz.");
                     }else{
                         password=newPassword;
                         System.out.println("Şifre oluşturuldu.");
                     }
                 }
            }else{
                System.out.println("Bilgileriniz Yanlış !");
            }
        }


    }
}
