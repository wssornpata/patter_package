package pattern_package;

public class Shape implements ShapeInterface {
    private String name;

    public Shape(String name) {
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public void printShape() {
        System.out.println("This is a " + getName());
    }
}