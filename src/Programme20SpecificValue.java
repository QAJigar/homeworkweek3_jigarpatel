public class Programme20SpecificValue {
    /**
     * Write a Java program to test if an array contains a specific value.
     */
    public static void ProgramH20() {

        int num[] = {7, 17, 38, 49, 75};
        boolean result = false;
        int searchValue = 17;

        for (int x : num) {
            if (x == searchValue) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("The numbers array contains the value: '" + searchValue + "'.");
        } else {
            System.out.println("The numbers array does not contain the value: '" + searchValue + "'.");
        }
    }

    public static void main(String[] args) {
        ProgramH20();

    }
}