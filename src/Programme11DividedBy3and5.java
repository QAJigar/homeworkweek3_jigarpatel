public class Programme11DividedBy3and5 {
    /**
     * Write a java program to print the numbers between 1to 100 which can be divided by 3
     * and 5 separately.
     */

    public static void main(String[] args) {
        // print numbers divided by 3
        System.out.println("n/Divided by 3: \t n/Divided by 5:");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(" \t\t" + i);
            }
            if (i % 5 == 0) {
                System.out.println(" \t\t\t\t\t\t\t " + i );
            }

        }

    }
}
