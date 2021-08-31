public class Torus implements ThreeDimensionalShape {

    int majorRadius, minorRadius;

    public int getMajorRadius() {
        return majorRadius;
    }

    public void setMajorRadius(int majorRadius) {
        this.majorRadius = majorRadius;
    }

    public int getMinorRadius() {
        return minorRadius;
    }

    public void setMinorRadius(int minorRadius) {
        this.minorRadius = minorRadius;
    }

    public Torus(int majorRadius, int minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return (3.14 * minorRadius * minorRadius) * (2 * 3.14 * majorRadius);
    }

    @Override
    public int numberOfDimentions() {
        return 3;
    }
}
