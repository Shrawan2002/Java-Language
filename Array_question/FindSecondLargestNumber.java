import java.util.*;

public class FindSecondLargestNumber {

    public static int secondLargestNum(int arr[]){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VA;
        for(int i=0; i<arr.length; i++){
            if (largest<arr[i]) {
                largest = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if (second<arr[i] && arr[i] != largest) {
                second = arr[i];
                
            }
        }
        System.out.println("largest number :" + largest);
        System.out.println("second largest number :" + second);
        return second;
    }
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arry element size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter arry element");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;

    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        System.out.println(secondLargestNum(arr));
    }
}
