package pattern_package;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int n = 1;
            while (n > 0) {
                System.out.println("Create butterfly shape with \"n\" (n must be an even value). Enter -1 to exit.");
                System.out.print("n: ");
                n = scanner.nextInt();

                if (n == -1) {
                    break;
                }

                if (n % 2 != 0) {
                    System.out.println("n is not an even number.");
                    continue;
                }

                if (n <= 0 || n > 50) {
                    System.out.println("n is not between 1 and 50.");
                    continue;
                }

                Shape butterflyShape = new ButterflyShape(n);
                butterflyShape.printShape();
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}