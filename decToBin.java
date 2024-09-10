public class decToBin {

    public static void decToBinary(int decNum){
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;
        while(decNum>0){
            int rem = decNum % 2;
            binNum = binNum + rem * (int)Math.pow(10,pow);
            decNum = decNum/2;
            pow++;
        }
        System.out.println("binary of " + myNum  + " = " + binNum);
    }
    public static void main(String[] args) {
        decToBinary(7);
    }
}
