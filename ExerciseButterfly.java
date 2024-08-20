package pattern_package;

import java.util.Scanner;

public class ExerciseButterfly {
    public static void main(String[] args) {
        String questionString = "Create butterfly shape with \"n\" (n must be an even value). Enter -1 to exit.";
        String askForInput = "n: ";
        char major = '+';
        char minor = ' ';
        char center = '-';
        PatternValidator patternValidator = new PatternValidator();
        try (Scanner scanner = new Scanner(System.in)) {
            int n = 1;
            while (true) {
                System.out.println(questionString);
                System.out.print(askForInput);
                n = scanner.nextInt();

                if (patternValidator.isOdd(n)) {
                    System.out.println("n is not an even number.");
                    continue;
                }

                if (!patternValidator.isValidRange(n)) {
                    System.out.println("n is not between 1 and 50.");
                    continue;
                }

                ButterflyShape butterflyShape = new ButterflyShape(n, major, minor, center);
                butterflyShape.printShape();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}