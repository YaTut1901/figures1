public class Circle extends Figure{

    private double radius;

    public Circle() {
        radius = (Math.random() * modifier1 + 1);
        setRandomColor();
    }

    public Circle(double radius, Colors color) {
        this.radius = radius;
        setColor(color);
    }

    public double Perimeter() {
        return 2 * Math.PI * radius;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }

    public void Print() {
        System.out.println("Я кружок, я кружок, нарисованным быть ок! Периметр: "
                + Perimeter() + "; Площадь: " + Area() + "; Радиус: " + getRadius() + "; Цвет: " + getColor());
    }

    public double getRadius() {
        return radius;
    }
}
