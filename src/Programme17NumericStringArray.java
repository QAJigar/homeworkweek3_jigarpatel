import java.util.Arrays;

public class Programme17NumericStringArray {
    /**
     * Write a Java program to sort a numeric array and a string array.
     */
    public static void main(String[] args) {
        int number[] = {97, 17, 7, 75, 54, 11, 36, 9, 1};
        System.out.println("Numeric array before sorting: " + Arrays.toString(number));
    Arrays.sort(number);
        System.out.println("Numeric array after shorting: " + Arrays.toString(number));

        String fruitsName[] = {"Orange", "Apple", "Pineapple", "Berry", "Mango"};

        System.out.println("String Array before sorting: " + Arrays.toString(fruitsName));

        Arrays.sort(fruitsName);
        System.out.println("String Array before shorting: " + Arrays.toString(fruitsName));

    }



}
