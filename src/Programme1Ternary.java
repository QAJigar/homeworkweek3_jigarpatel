import java.util.Scanner;

public class Programme1Ternary {
    /**
     * Write a java program that tells us that Input number is odd or even?
     * HINT: use ternary operator (? :)
     */
public void calYearEvenOdd(int num) {
    String evenOdd = (num % 2 == 0) ? "even number" : "odd number";
    System.out.println(num+" is " + evenOdd);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        Programme1Ternary obj = new Programme1Ternary();
        obj.calYearEvenOdd(num);
    }

}



