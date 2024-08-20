package pattern_package;

class DiamondShape extends Shape {
    private int n;

    public DiamondShape(int n) {
        super("DiamondShape");
        this.n = n;
    }

    @Override
    public void printShape() {
        boolean isReverse = false;
        int space = n / 2;
        int star = 1;
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < n; i++) {
            str.setLength(0);
            if (!isReverse) {
                for (int k = 0; k < space; k++) {
                    str.append(" ");
                }
                for (int l = 0; l < star; l++) {
                    str.append("*");
                }
                space--;
                star += 2;
            } else {
                for (int k = space; k > 0; k--) {
                    str.append(" ");
                }
                for (int l = star; l > 0; l--) {
                    str.append("*");
                }
                space++;
                star -= 2;
            }
            if (space == 0) {
                isReverse = true;
            }
            System.out.println(str);
        }
    }
}