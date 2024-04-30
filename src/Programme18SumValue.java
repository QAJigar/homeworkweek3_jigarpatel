public class Programme18SumValue {
    /**
     * Write a Java program to sum values of an array.
     */

    static int number[] = {5, 10, 25, 40, 65};

    public static int programH18() {

        int sum = 0;
        int i;
        for (i = 0; i < number.length; i++) {
            sum += number[i];
        }
return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum value of an array : " + programH18());
    }
}
