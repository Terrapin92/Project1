public class Triangle implements TwoDimensionalShape {
    int height, base;

    @Override
    public double getArea() {
        return (height * base)/2;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public int numberOfDimentions() {
        return 2;
    }
}
