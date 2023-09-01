public class Triangle extends Shape{
    private String name;

    public Triangle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "This is " + name;
    }
}
