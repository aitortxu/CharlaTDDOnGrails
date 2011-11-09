package charlatdd

import grails.test.ControllerUnitTestCase
import org.gmock.GMockController

class BookControllerTests extends ControllerUnitTestCase {
    def gmc
    def authors, charlesDickens, miguelDeCervantes

    BookControllerTests() {
        super(BookController)
        createAuthors()
    }

    protected void setUp() {
        super.setUp()
        setUpGMock()
        setUpServices()
    }

    protected void tearDown() {
        super.tearDown()
    }

    def test_two_by_two() {
        def hands = 'on blue'
        assert hands == 'on blue'
    }

    private def setUpGMock() {
        gmc = new GMockController()
    }

    private def setUpServices() {
        controller.bookService = new BookService()
        controller.authorService = new AuthorService()
    }

    private def createAuthors() {
        charlesDickens = new Author(name: 'Charles Dickens', birthYear: 1812)
        miguelDeCervantes = new Author(name: 'Miguel de Cervantes', birthYear: 1547)
        authors = new AuthorCollection()
        authors << charlesDickens
        authors << miguelDeCervantes
    }
}
