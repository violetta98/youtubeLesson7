package ua.lesson.lesson7;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Violetta on 12-07-2017.
 */
public class CalculatorTest {
    @Test
    public void addTest1() throws Exception { // OK
        Calculator calculator = new Calculator();
        calculator.add(1, 1);
        assertEquals(2, calculator.getResult());
    }

    @Test (expected = UserException.class) // we expects exception (OK)
    public void divTest1() throws Exception {
        Calculator calculator = new Calculator();
        calculator.div(); // not parameters (!)
    }

    @Test (expected = UserException.class) // Wrong (because exception won't throw)
    public void divTest2() throws Exception {
        Calculator calculator = new Calculator();
        calculator.div(2);
        assertEquals(1, calculator.getResult());
    }

    @Test
    public void divTest3() throws Exception { // OK
        Calculator calculator = new Calculator();
        calculator.div(2);
        assertEquals(1, calculator.getResult());
    }

    @Test (expected = IllegalArgumentException.class)
    public void divTest4() throws Exception { // OK
        Calculator calculator = new Calculator();
        calculator.div(2, 0, 13);
    }
}
