import java.util.*;
public class FunctionBinomial {

    public static int factorial(int n){
        int fac = 1;
        for(int i = 1; i<=n; i++){
            fac = fac*i;
        }
      return fac;
    }

    public static int  binomialCofficient(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int nmr = factorial(n-r);
        int binomialCoff = fact_n / (fact_r*nmr);
        return binomialCoff;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        // int pro = factorial(n);
        // System.out.println(pro);
        int binomialPro = binomialCofficient(n, r);
        System.out.println(binomialPro);

    }
}
