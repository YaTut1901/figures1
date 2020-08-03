public class Triangle extends Figure{

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3, Colors color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
    }

    public Triangle() {
        setRandomColor();
        side1 = Math.random() * modifier1 + 1;
        side2 = Math.random() * modifier1 + 1;
        side3 = Math.random() * modifier1 + 1;

    }

    public double Perimeter() {
        return side1 + side2 + side3;
    }

    public double Area() {
        return Math.sqrt((Perimeter() / 2) * (Perimeter()/2 - side1) *
                (Perimeter()/2 - side2) * (Perimeter()/2 - side3));
    }

    public void Print() {
        System.out.println("Я треугольник, я треугольник, самый крутой многоугольник! Периметр: "
                + Perimeter() + "; Площадь: " + Area() + "; Стороны: " + side1 + " " + side2 + " "
                + side3 + " " + "; Цвет: " + getColor());
    }
}
