import java.util.*;
public class HollowReactangle {
    public static void printHollowReact(int toRow, int toColom){
        for(int i=1; i<=toRow; i++){
            for(int j = 1; j<=toColom; j++){
                if (i==1 || i==toRow || j==1 || j==toColom) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colon = sc.nextInt();
        printHollowReact(row, colon);

    }
}
