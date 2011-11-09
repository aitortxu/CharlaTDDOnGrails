package charlatdd

import org.junit.Test

class RomanNumeralsTests {
    @Test
    void "convierte números a cifras romanas"() {
        assert RomanNumerals.toRoman(1) == 'I'
        assert RomanNumerals.toRoman(16) == 'XVI'
        assert RomanNumerals.toRoman(19) == 'XIX'
    }

}
