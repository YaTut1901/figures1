public class Square extends Figure{

    private long side;

    public Square(long side, String color) {
        this.side = side;
        this.setColor(color);
    }

    public Square() {
        this.side = (int)(Math.random() * 100 + 1);
        this.setRandomColor();
    }

    public long Perimeter() {
        return side * 4;
    }

    public long Area() {
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
