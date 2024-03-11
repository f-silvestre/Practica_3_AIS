package es.codeurjc.ais;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanConverterTest {

    @ParameterizedTest(name = "{0} should be {1}")
    @CsvSource({
        "I, 1",
        "II, 2",
        "III, 3",
        "X, 10",
        // "XX, 20",
        // "XXX, 30",
        // "XI, 11",
        // "IX, 9",
        // "V, 5",
        // "IV, 4",
        // "VI, 6",
        // "VII, 7",
        // "VIII, 8",
        // "L, 50",
        // "XL, 40",
        // ...
    })
    public void testRoman(String roman, int number) {
        RomanConverter converter = new RomanConverter();
        assertEquals(roman, converter.convert(number));
    }
    
    // Zero is not allowed
    // Negative numbers are not allowed
    // 4000 is not allowed

}
