public class Cylinder implements ThreeDimensionalShape {

    int radius, height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return 3.14 * radius * radius * height;
    }

    @Override
    public int numberOfDimentions() {
        return 3;
    }
}
