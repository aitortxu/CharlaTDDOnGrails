package charlatdd.bookController

import charlatdd.BookControllerTests
import charlatdd.BookCollection
import charlatdd.Book

class ListTests extends BookControllerTests {
    def books

    void setUp() {
        super.setUp()
        books = new BookCollection()
        books << new Book(title: 'Super Humor') << new Book(title: 'Astérix y Obélix')
    }

    void tearDown() {
        super.tearDown()
    }

}
