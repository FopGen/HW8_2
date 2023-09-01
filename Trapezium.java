public class Trapezium extends Shape{
    private String name;

    public Trapezium(String name) {
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
