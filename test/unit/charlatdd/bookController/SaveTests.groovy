package charlatdd.bookController

import static org.hamcrest.CoreMatchers.any
import static org.gmock.GMock.constructor
import charlatdd.BookControllerTests
import charlatdd.Book

class SaveTests extends BookControllerTests {
    def mockedBook

    void setUp() {
        super.setUp()
        controller.authorService.metaClass.all = authors
    }

    void tearDown() {
        super.tearDown()
    }

    void test_crea_una_instancia_de_Book_con_los_datos_del_formulario() {
        mockedBook = gmc.mock(Book, constructor(controller.params))
        mockedBook.validate().returns(false)
        gmc.play {
            controller.save()
        }
    }

    void test_si_los_datos_validan_usa_bookService_para_persistir_la_entidad() {
        Book.metaClass.validate = {-> true }
        gmc.mock(controller.bookService).persist(any(Book))
        gmc.play {
            controller.save()
        }
    }

    void test_si_todo_va_bien_prepara_un_flash_con_un_mensaje() {
        Book.metaClass.validate = {-> true }
        controller.bookService.metaClass.persist = { book -> }
        def fakeFlash = new Expando()
        controller.metaClass.flash = fakeFlash
        controller.save()
        assert fakeFlash.message.contains('Libro creado satisfactoriamente')
    }

    void test_si_todo_va_bien_redirige_al_listado() {
        Book.metaClass.validate = {-> true }
        controller.bookService.metaClass.persist = { book -> }
        controller.save()
        assert controller.redirectArgs.action == 'list'
    }

}
