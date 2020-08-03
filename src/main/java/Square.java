public class Square extends Figure{

    private double side;

    public Square(double side, Colors color) {
        this.side = side;
        setColor(color);
    }

    public Square() {
        side = Math.random() * modifier1 + 1;
        setRandomColor();
    }

    public double Perimeter() {
        return side * modifier2;
    }

    public double Area() {
        return side * side;
    }

    public void Print() {
        System.out.println("Я квадрат, я квадрат, мне на экране каждый рад! Периметр: "
                + Perimeter() + "; Площадь: " + Area() + "; Сторона: " + getSide() + "; Цвет: " + getColor());
    }

    public double getSide() {
        return side;
    }

}
