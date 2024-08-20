package pattern_package;

public class Shape {
    
    public void printShape() {
        System.out.println("This is some Shape");
    }

    protected StringBuilder flipVertical(StringBuilder str) {
        String[] lines = str.toString().split("\n");
        StringBuilder flipped = new StringBuilder();
        for (int i = lines.length - 1; i >= 0; i--) {
            flipped.append(lines[i]);
            flipped.append("\n");
        }
        return flipped;
    }
}