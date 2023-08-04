package pro.sky.java.course2.homeworkcalculator;

import org.junit.jupiter.api.Test;
import pro.sky.java.course2.homeworkcalculator.exceptions.ArgumentIsNullException;
import pro.sky.java.course2.homeworkcalculator.exceptions.DivisionByZeroException;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.homeworkcalculator.constants.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplTest {

    private final CalculatorService out = new CalculatorServiceImpl();


    @Test
    public void shouldReturnHelloMessage() {
        String actual = out.hello();
        assertEquals(CORRECT_MESSAGE, actual);
        assertNotNull(actual);
    }

    @Test
    public void shouldReturnResultOfSum() {
        String expected;
        String actual;
        for (int i = 0; i < FIRST_PARAM.length; i++) {
            expected = FIRST_PARAM[i] + " + " + SECOND_PARAM[i] + " = " + (FIRST_PARAM[i] + SECOND_PARAM[i]);
            actual = out.plus(FIRST_PARAM[i], SECOND_PARAM[i]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void shouldReturnResultOfSubtraction() {
        String expected;
        String actual;
        for (int i = 0; i < FIRST_PARAM.length; i++) {
            expected = FIRST_PARAM[i] + " - " + SECOND_PARAM[i] + " = " + (FIRST_PARAM[i] - SECOND_PARAM[i]);
            actual = out.minus(FIRST_PARAM[i], SECOND_PARAM[i]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void shouldReturnResultOfMultiply() {
        String expected;
        String actual;
        for (int i = 0; i < FIRST_PARAM.length; i++) {
            expected = FIRST_PARAM[i] + " * " + SECOND_PARAM[i] + " = " + (FIRST_PARAM[i] * SECOND_PARAM[i]);
            actual = out.multiply(FIRST_PARAM[i], SECOND_PARAM[i]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void shouldReturnResultOfDivide() {
        String expected;
        String actual;
        for (int i = 0; i < FIRST_PARAM.length; i++) {
            expected = (double)FIRST_PARAM[i] + " / " + (double)SECOND_PARAM[i] + " = " + ((double)FIRST_PARAM[i] / (double)SECOND_PARAM[i]);
            actual = out.divide((double)FIRST_PARAM[i], (double)SECOND_PARAM[i]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void shouldThrowArgumentIsNullExceptionWhenOneOrBothParametersIsNull() {
        assertThrows(ArgumentIsNullException.class, () -> out.plus(null, 5));
        assertThrows(ArgumentIsNullException.class, () -> out.plus(5, null));
        assertThrows(ArgumentIsNullException.class, () -> out.plus(null, null));
        assertThrows(ArgumentIsNullException.class, () -> out.minus(null, 5));
        assertThrows(ArgumentIsNullException.class, () -> out.minus(5, null));
        assertThrows(ArgumentIsNullException.class, () -> out.minus(null, null));
        assertThrows(ArgumentIsNullException.class, () -> out.multiply(null, 5));
        assertThrows(ArgumentIsNullException.class, () -> out.multiply(5, null));
        assertThrows(ArgumentIsNullException.class, () -> out.multiply(null, null));
        assertThrows(ArgumentIsNullException.class, () -> out.divide(null, 5.0));
        assertThrows(ArgumentIsNullException.class, () -> out.divide(5.0, null));
        assertThrows(ArgumentIsNullException.class, () -> out.divide(null, null));
    }

    @Test
    public void shouldThrowDivisionByZeroExceptionWhenDivisionByZero() {
        assertThrows(DivisionByZeroException.class, () -> out.divide(5.0, 0.0));
    }
}