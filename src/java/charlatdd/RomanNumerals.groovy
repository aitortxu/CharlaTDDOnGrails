package charlatdd

class RomanNumerals {
    private static additiveNumerals = [
            1: 'I',
            5: 'V',
            10: 'X',
            50: 'L',
            100: 'C',
            500: 'D',
            1000: 'M'
    ]

    private static substractiveNumerals = [
            4: 'IV',
            9: 'IX',
            40: 'XL',
            90: 'XC',
            400: 'CD',
            900: 'CM'
    ]

    static toRoman(number) {
        def roman = new StringBuilder()
        numerals.reverseEach { intValue, numeral ->
            while (number >= intValue) {
                roman << numeral
                number -= intValue
            }
        }
        return roman.toString()
    }

    private static getNumerals() {
        def numerals = [:]
        numerals << additiveNumerals
        numerals << substractiveNumerals
        numerals.sort { it.key }
    }
}
