import org.example.TemperatureConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    void testcelsiusToFahrenheit(){
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(41, converter.celsiusToFahrenheit(5));
    }

    @Test
    void testfahrenheitToCelsius(){
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(5, converter.fahrenheitToCelsius(41));
    }

    @Test
    void testcelsiusToKelvin(){
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(373.15, converter.celsiusToKelvin(100));
    }


}
