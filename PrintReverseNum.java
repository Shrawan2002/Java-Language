import java.util.*;
public class PrintReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         
        // while (num>0) {
        //     int lastDig = num%10;
        //     System.out.print(lastDig);
        //     num = num/10;
        // }

          int revNum = 0;
        while (num>0) {
             revNum = revNum*10 + num%10;
            num = num/10;
        }
        System.out.println("Reverse Number is : " + revNum);
    }
}
