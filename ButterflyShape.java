package pattern_package;

class ButterflyShape extends Shape {
    private int n;
    private char major = '*';
    private char minor = ' ';
    private char center = '-';

    ButterflyShape(int n, char major, char minor, char center) {
        this.n = n;
        this.major = major;
        this.minor = minor;
        this.center = center;
    }

    @Override
    public void printShape() {
        int wingSpaceSize = (2 * n) + 1;

        StringBuilder shape = new StringBuilder();
        
        StringBuilder upperWing = wingBuilder(wingSpaceSize);
        shape.append(upperWing);

        shape.append(middleBuilder());

        shape.append(flipVertical(upperWing));
        
        System.out.print(shape);
    }

    private StringBuilder wingBuilder(int wingSpaceSize) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            appendSymbol(str, i, major);
            appendSymbol(str, wingSpaceSize, minor);
            appendSymbol(str, i, major);
            str.append("\n");
            wingSpaceSize -= 2;
        }
        return str;
    }

    private void appendSymbol(StringBuilder str, int size, char symbol) {
        for (int i = 0; i < size; i++) {
            str.append(symbol);
        }
    }

    private StringBuilder middleBuilder() {
        StringBuilder str = new StringBuilder();
        appendSymbol(str, n, major);
        str.append(center);
        appendSymbol(str, n, major);
        str.append("\n");
        return str;
    }
}