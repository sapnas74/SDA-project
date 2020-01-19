/*
package junit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Example3 {

    @Test
    public void testAssertEquals() {
        // given
        int firstNum = 2;
        int secondNum = 32;

        //when

        int result = firstNum * secondNum;

        // then
        Assert.assertEquals(result, 2*32);
        Assert.assertNotEquals("Values are not equal", 1,2);
    }

    @Ignore
    @Test
    public void testAssertTrueFalse() {
        // given
        int firstNum = 3;
        int secondNum = 3;

        //when
        if (firstNum == secondNum) {System.out.println("Hello");}

        //then
        Assert.assertEquals(firstNum == secondNum,3 == 3);
        Assert.assertFalse("Hello".equals("Hello"));
    }

    @Test
    public void testArrayEquals() {
        int[] firstArray = {1,2,3};
        int[] secondArray = {4,5,6};
        Assert.assertArrayEquals(firstArray, secondArray);
    }

    @Test
    public void testAssertNull() {
        String s = null;
        Assert.assertNull(s);
    }

    @Test
    public void testAssertSame () {
        String s1 = "abc";
        String s2 = "abc";
        Assert.assertNotSame(s1, s2);
    }
}

 */
