public class Programme19Average {
    /**
     * Write a Java program to calculate the average value of array elements.
     */
    public static void main(String[] args) {
        int num[] = new int[]{5, 20, 35, 40, 50, 65};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
       double avg = (double) sum / num.length;
        System.out.println("Average value of array elements is : " + avg);

    }

}
