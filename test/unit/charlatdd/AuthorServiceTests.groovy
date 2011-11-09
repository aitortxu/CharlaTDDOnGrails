package charlatdd

import org.junit.Before
import org.gmock.GMockController
import org.junit.Test
import static org.gmock.GMock.match

class AuthorServiceTests {
    def gmc
    def mockedAuthor
    def service

    @Before
    void setUp() {
        gmc = new GMockController()
        mockedAuthor = gmc.mock(Author)
        service = new AuthorService()
    }

    @Test
    void "devuelve todos los Author"() {
        mockedAuthor.static.findAll().returns([])
        gmc.play {
            service.all
        }
    }

    @Test
    void "cuenta los Author que hay"() {
        mockedAuthor.static.count().returns(0)
        gmc.play {
            service.total
        }
    }

    @Test
    void "persiste Author"() {
        def author = new Author(name: 'Cocotero')
        gmc.mock(author).save(match { it.flush && it.failOnError })
        gmc.play {
            service.persist(author)
        }
    }
}
