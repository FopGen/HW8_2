public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle");
        circle.printName(circle);

        Shape quad = new Quad("Quad");
        quad.printName(quad);

        Shape oval = new Quad("Oval");
        oval.printName(oval);

        Shape triangle = new Quad("Triangle");
        triangle.printName(triangle);

        Shape trapezium = new Quad("Trapezium");
        trapezium.printName(trapezium);
    }
}
