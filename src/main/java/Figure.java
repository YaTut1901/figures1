import java.util.Random;

public abstract class Figure {

    public static int modifier1 = 100;
    public static int modifier2 = 4;
    private Colors color;

    public abstract double Perimeter();

    public abstract double Area();

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public void setRandomColor() {
        color = Colors.values()[new Random().nextInt(Colors.values().length)];
    }

    public abstract void Print();

}
