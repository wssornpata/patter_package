package pattern_package;

class ButterflyShape extends Shape {
    private int n;

    ButterflyShape(int n) {
        super("ButterflyShape");
        this.n = n;
    }

    @Override
    public void printShape() {
        int space = (2 * n)+1;
        StringBuffer  str = new StringBuffer ();
        // Upper part
        for (int i = 0; i < n; i++) {
            str.setLength(0);
            printStarNormal(str, i);
            printSpace(str, space);
            printStarNormal(str, i);
            space -= 2;
            System.out.println(str);
        }

        // Middle part
        str.setLength(0);
        printStarNormal(str, n);
        str.append("-");
        space = 3;
        printStarNormal(str, n);
        System.out.println(str);

        // Lower part
        for (int i = 0; i < n; i++) {
            str.setLength(0);
            printStarReverse(str, i);
            printSpace(str, space);
            printStarReverse(str, i);
            space += 2;
            System.out.println(str);
        }
    }

    private void printStarNormal(StringBuffer str, int length) {
        for (int j = 0; j < length; j++) {
            str.append("*");
        }
    }

    private void printStarReverse(StringBuffer str, int length) {
        for (int j = (n - 1) - length; j > 0; j--) {
            str.append("*");
        }
    }

    private void printSpace(StringBuffer str, int length) {
        for (int j = 0; j < length; j++) {
            str.append(" ");
        }
    }
}