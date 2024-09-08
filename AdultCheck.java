public class AdultCheck {
    public static void main(String[] args) {
        int age = 16;
        if (age>=18) {
            System.out.println("adult : drive, Vote");
        }
        if (age>13 && age<18) {
            System.out.println("you are teenager");
        }
        else{
            System.out.println("you are not Adult");
        }
    }
}
