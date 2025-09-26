// Square.java
public class Square extends Rectangle {
    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width; // width == length for square
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    // Если вызывают setWidth/setLength — делаем так, чтобы квадрат сохранял равенство сторон:
    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square[side=" + getSide() + ", color=" + color + ", filled=" + filled + "]";
    }
}
