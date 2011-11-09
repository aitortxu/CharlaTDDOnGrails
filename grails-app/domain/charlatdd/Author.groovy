package charlatdd

class Author {
    String name
    String slug
    int birthYear

    static hasMany = [books: Book]
    static constraints = {
        name nullable: false, blank: false
        slug nullable: false, blank: false, unique: true
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
        return [name: name, slug: slug, birthYear: birthYear, century: century]
    }

    void setName(name) {
        this.name = name
        this.slug = name.toLowerCase().replaceAll(' ', '-')
    }

}
