import java.util.*;
public class functionFactorial {

    public static int factorial(int n){
        int fac = 1;
        for(int i = 1; i<=n; i++){
          fac = fac*i;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac = factorial(n);
        System.out.println(fac);

    }
}
