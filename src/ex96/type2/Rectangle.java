package ex96.type2;

public class Rectangle {
    private double x;
    private double y;
    private double width;

    private Rectangle(double x, double y, double width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public static Rectangle from(String value) {
        if (value.equals("small")) {
            return new Rectangle(50, 50, 50 * 50);
        } else if (value.equals("medium")) {
            return new Rectangle(100, 100, 100 * 100);
        } else if (value.equals("large")) {
            return new Rectangle(200, 200, 200 * 200);
        } else {
            throw new IllegalArgumentException("Invalid rectangle value");
        }
    }

    public static Rectangle of(double x, double y) {
        return new Rectangle(x, y, x * y);
    }
}