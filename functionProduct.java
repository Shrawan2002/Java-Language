import java.util.*;
public class functionProduct {
    public static int multiple(int a, int b){
        int pro = a*b;
        return pro;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pro = multiple(a, b);
        System.out.println("multiple is :" + pro );
    }
}
