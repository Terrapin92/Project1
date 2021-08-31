public class Cube  implements ThreeDimensionalShape{

    int area;

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Cube(int area) {
        this.area = area;
    }

    @Override
    public double getVolume() {
        return area * area * area;
    }

    @Override
    public int numberOfDimentions() {
        return 3;
    }
}
