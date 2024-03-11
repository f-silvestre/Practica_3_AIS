package es.codeurjc.ais;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RomanConverterTest {

    // I
    @Test
    @DisplayName("Convert 1 to I")
    public void testI() {
        RomanConverter converter = new RomanConverter();
        assertEquals("I", converter.convert(1));
    }
    // II
    // III
    // X
    // XX
    // XXX
    // XI
    // IX
    // V
    // IV
    // VI
    // VII
    // VIII
    // L
    // XL
    // ...
    // Zero is not allowed
    // Negative numbers are not allowed
    // 4000 is not allowed

}
