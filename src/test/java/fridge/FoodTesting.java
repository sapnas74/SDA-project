package fridge;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;


public class FoodTesting {

    @Test
    public void testFridge() {
        //given
        Fridge fridge = new Fridge();

        //when
        fridge.put("cheese");

        //then
        assertEquals(true, fridge.contains("cheese"));
        assertNotEquals(false, fridge.put("cheese"));
        assertEquals(true, fridge.contains("cheese"));

        assertEquals(false, fridge.contains("ham"));

        fridge.put("ham");
        assertEquals(true, fridge.contains("cheese"));
        assertEquals(true, fridge.contains("ham"));

        try {
            fridge.take("sausage");
            fail("There was no sausage in the fridge!");
        } catch (NoSuchItemException e) {
            //ok
        }
    }

    @Test
    public void testNoSuchException() {
        Fridge fridge = new Fridge();
        try {
            fridge.take("sausage");
            fail("There was no sausage in the fridge!"); //iki cia natejo net
        } catch (NoSuchItemException e) {
            assertEquals("sausage not found in the fridge", e.getMessage());
        }
    }

    @Test
    public void testFridgeSize() {
        //given
        Fridge fridge = new Fridge();
        fridge.put("milk");
        fridge.put("bread");
        fridge.put("sugar");

        //when
        int result = fridge.getFridgeSize();

        //then
        assertEquals(3, result);
    }
}