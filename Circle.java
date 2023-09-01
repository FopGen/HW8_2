public class Circle extends Shape{
    private String name;

    public Circle(String name) {
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
