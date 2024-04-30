import java.util.Scanner;

public class Programme16PositiveNegative {
    /**
     * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
     * “ZERO”
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        double number = sc.nextDouble();
        sc.close();

        if (number > 0) {
            System.out.println(number + " Is a Positive Number");
        } else if (number < 0) {
            System.out.println("Is a Negative Number");
        } else if (number == 0){
            System.out.println(number + "Is a Zero Number");
        } else {
            System.out.println("Invalid Number");
        }

    }











}
