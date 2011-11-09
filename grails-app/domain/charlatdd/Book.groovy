package charlatdd

class Book {
    String title

    static belongsTo = Author
    static hasMany = [authors: Author]
    static constraints = {
        title nullable:false, blank: false
    }

    def asMap() {
        return [title: title, authors: authors.collect { it.asMap() }]
    }
}
