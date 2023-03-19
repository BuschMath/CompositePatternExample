public class CompositeExample {

    public static void main(String[] args) {
        // Create some shapes
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape rectangle = new Rectangle();

        // Create a drawing and add the shapes to it
        Drawing drawing = new Drawing();
        drawing.add(circle1);
        drawing.add(circle2);
        drawing.add(rectangle);

        // Draw the drawing
        drawing.draw();
    }
}

