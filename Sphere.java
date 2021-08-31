public class Sphere implements ThreeDimensionalShape {

    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4/3) * 3.14 * radius*radius*radius;
    }

    @Override
    public int numberOfDimentions() {
        return 3;
    }
}
