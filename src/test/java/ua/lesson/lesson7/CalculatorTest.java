package ua.lesson.lesson7;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Violetta on 12-07-2017.
 */
public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1, 1);
        assertEquals(2, calculator.getResult());
        calculator.cleanResult();
        calculator.add(4,7);
        assertEquals(11, calculator.getResult());
    }

    @Test
    public void div() throws Exception {
        Calculator calculator = new Calculator();
        calculator.div(1,4,6);
        assertEquals(0, calculator.getResult());
    }
}
