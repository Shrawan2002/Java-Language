import java.util.*;
public class SolidRhombus {
    public static void solidRhombus(int n){
        for(int i = 1; i<=n; i++){
            //space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            // print star
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solidRhombus(n);
    }
}
