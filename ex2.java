package pattern_package;

import java.util.Scanner;
import static java.lang.System.out;

class ex2 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        Shape butterflyShape;
        boolean loop = true;
        int n = 0;
        while (loop) {
            System.out.println("Create butterfly shape follow by \"n\". (n is even value only)");
            System.out.print("n: ");
            n = sc.nextInt();
            if (n % 2 == 0) {
                if (n > 0 && n <= 50) {
                    butterflyShape = new ButterflyShape(n);
                    butterflyShape.printShape();
                } else {
                    out.println("n is not between 1 and 50.");
                }
            } else {
                out.println("n is not even number.");
            }
        }
        sc.close();
    }
}