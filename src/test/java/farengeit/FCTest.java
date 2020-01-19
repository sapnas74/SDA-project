package farengeit;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FCTest {

    @Test
    public void testFC() {
        //given
        FahrenheitCelsiusConverter fahrenheitCelsiusConverter = new FahrenheitCelsiusConverter();

        assertEquals(25, fahrenheitCelsiusConverter.toCelsius(77));
        assertEquals(86, fahrenheitCelsiusConverter.toFahrenheit(30));

    }
}
