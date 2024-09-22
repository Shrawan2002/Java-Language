import java.util.*;
public class keySearch2D_array {
    public static boolean searchKey(int matrix[][] , int key){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found ");
        return false;

    }
    public static void main(String[] args) {
       
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 elements for the 3x3 matrix:");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Enter the key to search:");
        int key = sc.nextInt();
        searchKey(matrix,key);
    }
}
