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
        int whitespace = n / 2;
        int star = 1;
        for (int i = 0; i < n; i++) {
            String str = "";
            if (isReverse) {
                for (int k = whitespace; k > 0; k--) {
                    str += " ";
                }
                for (int l = star; l > 0; l--) {
                    str += "*";
                }
                whitespace++;
                star-=2;
            } else {
                for (int k = 0; k < whitespace; k++) {
                    str += " ";
                }
                for (int l = 0; l < star; l++) {
                    str += "*";
                }
                whitespace--;
                star+=2;
            }
            
            if(whitespace == 0){
                isReverse = true;
            }
            System.out.println(str);
        }
    }
}