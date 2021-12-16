public class Main {
    public static boolean isPalindrome(int num){
        String numm=num+"";
        boolean isPalindorme=true;
        for(int i=0;i<numm.length();i++){
            if(numm.charAt(i)==numm.charAt(numm.length()-i-1)){
                isPalindorme=true;
            }else{
                isPalindorme=false;
                break;
            }
        }
        return isPalindorme;
    }

    public static void main(String[] args) {
        System.out.println( isPalindrome(4004));

    }

}
