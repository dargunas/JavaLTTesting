package TestingRecap;


import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class ShapeCalculatorTest {

    private ShapeCalculator shapeCalculator = new ShapeCalculator();

    @Test
    void testCalculateSquareArea() {
        double squareWidth = 5.5;
        double squareHeight = 6.8;

        double sąuareArea = shapeCalculator.calculateSquareArea(squareHeight, squareWidth);

        assertThat(sąuareArea).isEqualTo(37.4);
    }

    @Test
    void shouldReturnZero_WhenParametersAreNegative() {
        double squareWidth = 5.5;
        double squareHeight = -6.8;

        double squareArea = shapeCalculator.calculateSquareArea(squareHeight, squareWidth);

        assertThat(squareArea).isEqualTo(0);

    }

    @Test
    void testCalculateSquareVolume() {
        double squareWidth = 5.5;
        double squareHeight = 6.8;
        double squareLength = 2;

        double squareVolume = shapeCalculator.calculateSquareVolume(squareHeight, squareWidth, squareLength);

        assertThat(squareVolume).isEqualTo(74.8);


    }

    @Test
    void testlCulateCircleArea() {
        double circleRadius = 15;

        double circleArea = shapeCalculator.calculateCircleArea(circleRadius);

        assertThat(circleArea).isEqualTo(706.5);
    }

    @Test
    void testCalculateSphereSurfaceArea() {
        double circleRadius = 5;

        double sphereSurfaceArea = shapeCalculator.calculateSphereSurfaceArea(circleRadius);

        assertThat(sphereSurfaceArea).isEqualTo(314);

    }
}