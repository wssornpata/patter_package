package pattern_package;

import java.util.Scanner;

public class ExerciseDiamond {
    public static void main(String[] args) {
        String questionString = "Create diamond shape with \"n\" (n must be an odd value). Enter -1 to exit.";
        String askForInput = "n: ";
        PatternValidator patternValidator = new PatternValidator();
        char major = '+';
        char minor = ' ';
        try (Scanner scanner = new Scanner(System.in)) {
            int n = 1;
            while (true) {
                System.out.println(questionString);
                System.out.print(askForInput);
                n = scanner.nextInt();

                if (!patternValidator.isOdd(n)) {
                    System.out.println("n is not an odd number.");
                    continue;
                }

                if (!patternValidator.isValidRange(n)) {
                    System.out.println("n is not between 1 and 50.");
                    continue;
                }

                DiamondShape diamondShape = new DiamondShape(n, major, minor);
                diamondShape.printShape();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}