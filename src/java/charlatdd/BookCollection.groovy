package charlatdd

class BookCollection {
    @Delegate List books = []

    def asMap() {
        return books.collect { it.asMap() }
    }
}
