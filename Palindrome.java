public class Palindrome {

    public static boolean isPalindrom(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-1-i)) {
                System.out.println("string is not palindrom");
                return false;
            }
        }
        System.out.println("string is palindrom");
        return true;
    }
    public static void main(String[] args) {
        String str = "racedar";
        isPalindrom(str);
    }
}
