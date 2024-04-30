import java.util.Scanner;

public class Programme13WeekDay {
    /**
     * Write a Java program which input any number between 1to7, and it prints The Days
     * name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
     * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");
int day = in.nextInt();
        System.out.println(getDayName(day));
        in.close();
    }
    public static String getDayName(int day) {
        String dayName;
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day in range";
            return dayName;
        }
        return dayName;
    }
}
