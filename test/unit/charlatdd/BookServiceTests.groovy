package charlatdd

import static org.gmock.GMock.match
import static org.hamcrest.CoreMatchers.any
import org.junit.Test
import org.junit.Before
import org.gmock.GMockController

class BookServiceTests {
    def gmc
    def mockedBook
    def service

    @Before
    void setUp() {
        gmc = new GMockController()
        mockedBook = gmc.mock(Book)
        service = new BookService()
    }

    @Test
    void "devuelve todos los Book"() {
        mockedBook.static.findAll().returns([])
        gmc.play {
            service.all
        }
    }

    @Test
    void "cuenta los Book que hay"() {
        mockedBook.static.count().returns(0)
        gmc.play {
            service.total
        }
    }

    @Test
    void "persiste Books"() {
        def book = new Book(title: 'Cocotero')
        gmc.mock(book).save(match { it.flush && it.failOnError })
        gmc.play {
            service.persist(book)
        }
    }
}
