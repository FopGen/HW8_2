public class Oval extends Shape{
    private String name;

    public Oval(String name) {
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
