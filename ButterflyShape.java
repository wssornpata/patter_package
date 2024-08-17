package pattern_package;

import static java.lang.System.out;

class ButterflyShape extends Shape {
    private int n;

    ButterflyShape(int n) {
        super("ButterflyShape");
        this.n = n;
    }

    @Override
    public void printShape() {
        int space = (2 * n)+1;
        String str = new String();
        // Upper part
        for (int i = 0; i < n; i++) {
            str = "";
            str = printStarNormal(str, i);
            str = printSpace(str, space);
            str = printStarNormal(str, i);
            space -= 2;
            out.println(str);
        }

        // Middle part
        str = "";
        str = printStarNormal(str, n);
        str += "-";
        space = 3;
        str = printStarNormal(str, n);
        out.println(str);

        // Lower part
        for (int i = 0; i < n; i++) {
            str = "";
            str = printStarReverse(str, i);
            str = printSpace(str, space);
            str = printStarReverse(str, i);
            space += 2;
            out.println(str);
        }
    }

    private String printStarNormal(String str, int length) {
        for (int j = 0; j < length; j++) {
            str += "*";
        }
        return str;
    }

    private String printStarReverse(String str, int length) {
        for (int j = (n - 1) - length; j > 0; j--) {
            str += "*";
        }
        return str;
    }

    private String printSpace(String str, int length) {
        for (int j = 0; j < length; j++) {
            str += " ";
        }
        return str;
    }
}