public class bubbleOptimisedCode {
    public static void optimizedCode(int arr[]){
        int swap = 0;
        for(int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swap++;
            }
        }
        System.out.println(swap);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        optimizedCode(arr);
    }
}
