public class Number_Pyramid {
    public static void number_Pyramid(int n){
        int count = 1;
        for(int i = 1; i<=n; i++){
            //space 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
            }
            count++;
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        number_Pyramid(5);
    }
}
