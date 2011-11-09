package charlatdd.bookController

import charlatdd.BookControllerTests
import charlatdd.BookCollection
import charlatdd.Book

class ListTests extends BookControllerTests {
    def books

    void setUp() {
        super.setUp()
        createBooks()
    }

    void tearDown() {
        super.tearDown()
    }

    private def createBooks() {
        Book oliverTwist = createOliverTwist()
        Book elQuijote = createElQuijote()
        books = new BookCollection()
        books << oliverTwist
        books << elQuijote
    }

    private Book createElQuijote() {
        def elQuijote = new Book(title: 'El Quijote de la Mancha')
        elQuijote.metaClass.authors = [miguelDeCervantes]
        return elQuijote
    }

    private Book createOliverTwist() {
        def oliverTwist = new Book(title: 'Oliver Twist')
        oliverTwist.metaClass.authors = [charlesDickens]
        return oliverTwist
    }

}
