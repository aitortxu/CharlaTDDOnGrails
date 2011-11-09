package charlatdd

class BookService {

    static transactional = true

    def getAll() {
        def books = new BookCollection()
        books.addAll Book.findAll()
        books
    }

    def getTotal() {
        Book.count()
    }

    def persist(book) {
        book.save(flush: true, failOnError: true)
    }
}
