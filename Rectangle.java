public class Rectangle implements TwoDimensionalShape{

    int width, length;

    @Override
    public double getArea() {
        return width * length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public int numberOfDimentions() {
        return 2;
    }
}
