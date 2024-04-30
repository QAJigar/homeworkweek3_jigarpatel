import java.util.Scanner;

public class Programme9Switch {
    /**
     * Same as above program-8 using switch statement.
     */
    public static void main(String[] args) {
        String cityName;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any alphabet from 'A' to 'F': ");
        char alphabet = scn.next().toUpperCase().charAt(0);
        scn.close();

        cityName = switch (alphabet) {
            case 'A' -> "Arlington";
            case 'B' -> "Birmingham";
            case 'C' -> "Coventry";
            case 'D' -> "Durham";
            case 'E' -> "Edinburgh";
            case 'F' -> "Florida Ridge";
            default -> "Invalid entry";
        };
        System.out.println("City Name: " +cityName);
}



}
