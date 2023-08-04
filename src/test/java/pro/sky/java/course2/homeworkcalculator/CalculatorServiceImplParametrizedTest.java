package pro.sky.java.course2.homeworkcalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.homeworkcalculator.constants.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplParametrizedTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsFromTests")
    public void shouldPerformCorrectCalculations(int firstValue, int secondValue) {
        String expectedPlusResult = firstValue + " + " + secondValue + " = " + (firstValue + secondValue);
        String expectedMinusResult = firstValue + " - " + secondValue + " = " + (firstValue - secondValue);
        String expectedMultiplyResult = firstValue + " * " + secondValue + " = " + (firstValue * secondValue);
        String expectedDivideResult = (double)firstValue + " / " + (double)secondValue + " = " + ((double)firstValue / (double)secondValue);

        String actualPlusResult = out.plus(firstValue, secondValue);
        String actualMinusResult = out.minus(firstValue, secondValue);
        String actualMultiplyResult = out.multiply(firstValue, secondValue);
        String actualDivideResult = out.divide((double)firstValue, (double)secondValue);

        assertEquals(expectedPlusResult, actualPlusResult);
        assertEquals(expectedMinusResult, actualMinusResult);
        assertEquals(expectedMultiplyResult, actualMultiplyResult);
        assertEquals(expectedDivideResult, actualDivideResult);

    }

    public static Stream<Arguments> provideParamsFromTests() {
        return Stream.of(
                Arguments.of(FIRST_PARAM[0], SECOND_PARAM[0]),
                Arguments.of(FIRST_PARAM[1], SECOND_PARAM[1])
        );
    }

}