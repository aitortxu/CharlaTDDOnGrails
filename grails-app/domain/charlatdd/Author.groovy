package charlatdd

class Author {
    String name
    int birthYear

    static hasMany = [books: Book]
    static constraints = {
        name nullable: false, blank: false
        birthYear nullable: false
    }

    def getCenturyAndName() {
        return "(${century}) ${name}"
    }

    def getCentury() {
        def century = Math.ceil(birthYear / 100).toInteger()
        return RomanNumerals.toRoman(century)
    }

    def asMap() {
        return [name: name, birthYear: birthYear, century: century]
    }
}
