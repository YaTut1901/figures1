public class Round extends Figure{

    private long radius;

    public long Perimeter() {
        return Math.round(6.28 * radius);
    }

    public long Area() {
        return Math.round(3.14 * radius * radius);
    }

    public void Print() {
        System.out.println("Я кружок, я кружок, нарисованным быть ок! Периметр: "
                + Perimeter() + "; Площадь: " + Area() + "; Радиус: " + getRadius() + "; Цвет: " + getColor());
    }

    public long getRadius() {
        return radius;
    }

    public Round() {
        this.radius = (int)(Math.random() * 100 + 1);
        this.setRandomColor();
    }


}
