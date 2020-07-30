public class Trapezoid extends Figure{

    private long[] bases = new long[2];

    private long[] sides = new long[2];

    private long height;

    public long Perimeter() {
        return bases[0] + bases[1] + sides[0] + sides[1];
    }

    public long Area() {
        return (int)(0.5*(bases[0] + bases[1])*height);
    }

    public void Print() {
        System.out.println("Я трапеция, я трапеция, у меня нет рифмы! Периметр: "
                + Perimeter() + "; Площадь: " + Area() + "; Основания: " + bases[0] + bases[1]
                + "; Стороны: " + sides[0] + sides[1] + "; Цвет: " + getColor());
    }

    public Trapezoid(long[] sides, long[] bases, long height, String color) {
        for(int i = 0; i < sides.length; i++) {
            this.sides[i] = sides[i];
            this.bases[i] = bases[i];
        }
        this.height = height;
        this.setColor(color);
    }

    public Trapezoid() {
        this.setRandomColor();
        bases[0] = (int)(Math.random() * 100 + 1);
        bases[1] = (int)(Math.random() * 100 + 1);
        sides[0] = (int)(Math.random() * (bases[0] + bases[1]) + 1);
        sides[1] = bases[0] + bases[1] - sides[0];
        height = (int)Math.sqrt(sides[0] * sides[0] - Math.pow((Math.pow((bases[0] - bases[1]), 2)
                + sides[0] * sides[0] - sides[1] * sides[1])/(2 * (bases[0] - bases[1])), 2));
    }
}
