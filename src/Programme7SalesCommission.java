import java.util.Scanner;

public class Programme7SalesCommission {
    /**
     * Write a java program input sales id, seller's name, sales amount, and salary basic and
     * then fined this sales Commission Sales amount >= 50,000 35% , >= 30,000 20% , >= 20,000 10%
     * >= 10,000 5% , < 10,000 2%
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name: ");
        System.out.print("enter sales id: ");
        System.out.print("enter sale amount: ");
        double sAmt = sc.nextDouble();
        System.out.print("enter salary basic: ");
        sc.close();
        if (sAmt >= 50000) {
            double commission = sAmt * 0.35;
            System.out.println(commission);
        } else if (sAmt >= 30000) {
            double commission = sAmt * 0.20;
            System.out.println(commission);
        } else if (sAmt >= 20000) {
            double commission = sAmt * 0.10;
            System.out.println(commission);
        } else if (sAmt >= 10000) {
            double commission = sAmt * 0.05;
            System.out.println(commission);
        } else if (sAmt < 10000) {
            double commission = sAmt * 0.02;
            System.out.println(commission);
        } else {
            System.out.println("Invalid");
        }
    }
}
