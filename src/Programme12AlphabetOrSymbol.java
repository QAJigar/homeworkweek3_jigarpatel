import java.util.Scanner;

public class Programme12AlphabetOrSymbol {
    /**
     * 12. Write a program that tells us input value is number or an alphabet or symbol.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;     //Declare a character
        System.out.println("Enter the character: ");
        ch = sc.next().charAt(0);   //Initialize the character
        sc.close();
        //check whether alphabet or not using if-else statement

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an Alphabet: ");
        } else {
            System.out.print(ch + " is not an Alphabet ");
        }
    }
}
