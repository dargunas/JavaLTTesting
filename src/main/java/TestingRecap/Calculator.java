package TestingRecap;

import org.apache.log4j.Logger;

import java.util.Arrays;

public class Calculator {

    private static final Logger LOGGER = Logger.getLogger(Calculator.class);

    public int add(int firstNumber, int secondNumber) {
        LOGGER.info("Adding two numbers " + firstNumber + " and " + secondNumber);
        return firstNumber + secondNumber;
    }

    public int addMultipleNumbers(int[] numbers) {
        LOGGER.info("Adding numbers" + Arrays.toString(numbers));
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public int minusNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int minusMultipleNumbers (int[] numbers){
        LOGGER.info("Subtracting numbers" + Arrays.toString(numbers));
        int total = numbers[0];

        for (int i = 1; i <numbers.length ; i++) {
            total -= numbers[i];
        }
        return total;
    }
    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

}
