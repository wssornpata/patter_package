package pattern_package;

import static java.lang.System.out;

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
        for (int i = 0; i < n; i++) {
            String str = "";
            if (isReverse) {
                for (int k = space; k > 0; k--) {
                    str += " ";
                }
                for (int l = star; l > 0; l--) {
                    str += "*";
                }
                space++;
                star-=2;
            } else {
                for (int k = 0; k < space; k++) {
                    str += " ";
                }
                for (int l = 0; l < star; l++) {
                    str += "*";
                }
                space--;
                star+=2;
            }
            
            if(space == 0){
                isReverse = true;
            }
            out.println(str);
        }
    }
}