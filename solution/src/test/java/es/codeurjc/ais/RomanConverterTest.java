package es.codeurjc.ais;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanConverterTest {

    private RomanConverter converter;

    @BeforeEach
    public void setup(){
        this.converter = new RomanConverter();
    }

    @ParameterizedTest(name = "{0} should be {1}")
    @CsvSource({
        "I, 1",
        "II, 2",
        "III, 3",
        "X, 10",
        "XX, 20",
        "XXX, 30",
        "XI, 11",
        "IX, 9",
        "V, 5",
        "IV, 4",
        "VI, 6",
        "VII, 7",
        "VIII, 8",
        "L, 50",
        "XL, 40",
        // ...
    })
    public void testRoman(String roman, int number) {       
        assertEquals(roman, converter.convert(number));
    }
    
    // Zero is not allowed
    @Test
    @DisplayName("Zero is not allowed")
    public void testRomanZero() {
        assertThrows(IllegalArgumentException.class, 
            () -> converter.convert(0)
        ).getMessage().equals("Number must be greater than zero");
    }
    // Negative numbers are not allowed
    @Test
    public void testRomanNegative() {
        assertThrows(IllegalArgumentException.class, 
            () -> converter.convert(-1)
        ).getMessage().equals("Number must be greater than zero");
    }    
    // 4000 is not allowed
    @Test
    public void testRomanGreaterThat3999() {
        assertThrows(IllegalArgumentException.class, 
            () -> converter.convert(4000)
        ).getMessage().equals("Number must be less than 4000");
    }

}
