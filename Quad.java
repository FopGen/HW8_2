public class Quad extends Shape{
    private String name;

    public Quad(String name) {
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
