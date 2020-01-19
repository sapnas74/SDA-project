package junit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class Example2 {

    @Test
    public void testAdd() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = (int) calculator.add(5,3);
        // then

        // assert result == 8;
        assertEquals(result, 8);
    }

    @Test
    public void testDivision() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = (int) calculator.divide(6,3);
        // then
        assertEquals(result, 2);
    }

    @Test
    public void testMinus() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = (int) calculator.minus(6,3);
        // then
        assertEquals(result, 3);
    }

    @Test
    public void testMultiply() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = (int) calculator.multiply(6,3);
        // then
        assertEquals(result, 18);
    }

}
