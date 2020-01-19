package junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Example6 {

    @BeforeClass
    public static void setupBeforeClass() {
        System.out.println("Run befre the first test metod");
    }

    @Before
    public void setUp() {
        System.out.println("Run before each test");
    }

    @After
    public void tearDown() {
        System.out.println("Run after each test");
    }

    @After
    public void tearDownAfterClass() {
        System.out.println("Run after the last test method");
    }

    @Test
    public void testExample1() {
        System.out.println("Implementation of the first test");
        Assert.assertTrue(1 !=0);
    }

    @Test
    public void testExample2() {
        System.out.println("Implementation of the second test");
        Assert.assertTrue(1 != 0);
    }
}
