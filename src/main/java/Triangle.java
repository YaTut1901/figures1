public class Triangle extends Figure{

    private long[] sides = new long[3];

    public long Perimeter() {
        return sides[0] + sides[1] + sides[2];
    }

    public long Area() {
        return (int)Math.sqrt((Perimeter() / 2) * (Perimeter()/2 - sides[0]) *
                (Perimeter()/2 - sides[1]) * (Perimeter()/2 - sides[2]));
    }

    public void Print() {
        System.out.println("Я треугольник, я треугольник, самый крутой многоугольник! Периметр: "
                + Perimeter() + "; Площадь: " + Area() + "; Стороны: " + sides[0] + " " + sides[1] + " "
                + sides[2] + " " + "; Цвет: " + getColor());
    }

    public Triangle(long[] sides, String color) {
        for(int i = 0; i < sides.length; i++) {
            this.sides[i] = sides[i];
        }
        this.setColor(color);
    }

    public Triangle() {
        this.setRandomColor();
        sides[0] = (int)(Math.random() * 100 + 1);
        sides[1] = (int)(Math.random() * 100 + 1);
        sides[2] = (int)(Math.random() * 100 + 1);

    }


}
