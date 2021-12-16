package TestingRecap;

public class GeometricShapeVariables {

    private double width;
    private double length;
    private double height;
    private double radius;

    public GeometricShapeVariables(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public GeometricShapeVariables(double width, double length, double height, double radius) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "GeometricShapeVariables{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", radius=" + radius +
                '}';
    }

}
