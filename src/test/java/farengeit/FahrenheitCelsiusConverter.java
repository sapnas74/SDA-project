package farengeit;

public class FahrenheitCelsiusConverter {
    public static int toCelsius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static int toFahrenheit(int celcius) {
        return celcius * 9/5 +32;
    }
}
