package TestingRecap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;


class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void testAddTwoNumbers() {
        //given
        int firstNumber = 12;
        int secondNumber = 3;
        //when
        int addResult = calculator.add(firstNumber,secondNumber);
        //then
        assertEquals(15, addResult);
        assertThat(addResult).isEqualTo(15);
    }

    @Test
    void testAddMultipleNumbers() {
        int[] numbersToTest = {5, 2, -6, 8, 1};

        int actualMultipleAddResult = calculator.addMultipleNumbers(numbersToTest);

        assertThat(actualMultipleAddResult).isEqualTo(10);
    }

    @Test
    void testMinusNumbers() {
        int firstNumber = 15;
        int secondNumber = 5;

        int actualResult = calculator.minusNumbers(firstNumber, secondNumber);

        assertThat(actualResult).isEqualTo(10);
    }

    @Test
    void testMinusMultipleNumbers() {
        int[] numbersToMinus = {5, 6, 9,};

        int actualDifference = calculator.minusMultipleNumbers(numbersToMinus);

        assertThat(actualDifference).isEqualTo(-10);
    }
}