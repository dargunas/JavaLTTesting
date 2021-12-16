package TestingRecap;

public class ShapeCalculator {

    public final double PI = 3.14;

    public double calculateSquareArea(double height, double width) {
        if (height <= 0 || width <= 0) {
            System.out.println("Can't calculate area since one of parameters are below 0");
            return 0;
        }
        return height * width;
    }

    public double calculateSquareVolume(double height, double width, double lenght) {
        if (height <= 0 || width <= 0 || lenght <= 0) {
            System.out.println("All given values has to be more than 0!!!");
            return 0;
        }
        return height * width * lenght;
    }

    public double calculateCircleArea(double radius) {
        if (radius <= 0) {
            System.out.println("radius has to have positive value");
            return 0;
        }
        return (Math.pow(radius, 2.0)) * PI;
    }

    public double calculateSphereSurfaceArea (double radius) {
        if (radius <= 0) {
            System.out.println("radius has to have positive value");
            return 0;
        }
        return 4 * PI * Math.pow(radius, 2.0);
    }


}


