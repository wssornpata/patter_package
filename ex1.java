package pattern_package;

import java.util.Scanner;
import static java.lang.System.out;

class ex1 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        Shape diamondShape;
        boolean loop = true;
        int n = 0;
        while (loop) {
            System.out.println("Create diamond shape follow by \"n\". (n is odd value only)");
            System.out.print("n: ");
            n = sc.nextInt();
            if (n % 2 == 1) {
                if (n > 0 && n <= 50) {
                    diamondShape = new DiamondShape(n);
                    diamondShape.printShape();
                }else {
                    out.println("n is not between 1 and 50.");
                }
            } else {
                out.println("n is not odd number.");
            }
        }
        sc.close();
    }

}