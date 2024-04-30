import java.util.Scanner;

public class Programme6OddOrEven {
/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public void ProgramH6(int num){

 if (num % 2 == 0) {
        System.out.println(num + " is an even number");
    } else {
        System.out.println(num + " is an odd number");
    }
}

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scn.nextInt();
    scn.close();
Programme6OddOrEven obj = new Programme6OddOrEven();
obj.ProgramH6(num);

}
}
