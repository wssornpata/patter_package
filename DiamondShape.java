package pattern_package;

class DiamondShape extends Shape {
    private char major = '*';
    private char minor = ' ';
    private int n;

    public DiamondShape(int n) {
        this.n = n;
    }

    public DiamondShape(int n, char major, char minor) {
        this.n = n;
        this.major = major;
        this.minor = minor;
    }

    @Override
    public void printShape() {
        int pyramidHeight = n / 2;
        int minorInitSize = n / 2;
        int majorInitCount = 1;

        StringBuilder pyramid = pyramidBuilder(pyramidHeight, majorInitCount, minorInitSize);

        StringBuilder lowerPyramid = flipVertical(pyramid);

        int middleSize = n;
        for (int i = 0; i < middleSize; i++) {
            pyramid.append(major);
        }
        pyramid.append("\n");

        pyramid.append(lowerPyramid);
        System.out.print(pyramid);
    }

    private StringBuilder pyramidBuilder(int pyramidHeight, int majorInitCount, int minorInitSize) {
        StringBuilder pyramid = new StringBuilder();
        for (int i = 0; i < pyramidHeight; i++) {
            for (int k = 0; k < minorInitSize; k++) {
                pyramid.append(minor);
            }
            for (int l = 0; l < majorInitCount; l++) {
                pyramid.append(major);
            }
            pyramid.append("\n");
            minorInitSize--;
            majorInitCount += 2;
        }
        return pyramid;
    }
}