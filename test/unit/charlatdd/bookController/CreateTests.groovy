package charlatdd.bookController

import charlatdd.BookControllerTests
import charlatdd.Book


class CreateTests extends BookControllerTests {

    void setUp() {
        super.setUp()
        Book.metaClass.properties = new Expando()
    }

    void tearDown() {
        super.tearDown()
    }

    void test_usa_authorService_para_obtener_el_listado_de_autores() {
        gmc.mock(controller.authorService).getAll().returns(authors)
        gmc.play {
            controller.create()
        }
    }

    void test_devuelve_el_modelo_con_el_Book_limpio_y_la_lista_de_autores() {
        controller.authorService.metaClass.all = authors
        def model = controller.create()
        assert model.book instanceof Book
        assert model.authors == authors
    }

    void test_le_pasa_cualquier_param_de_entrada_como_propiedades_al_nuevo_Book() {
        controller.authorService.metaClass.all = authors
        controller.params.chuchu = 'blabla'
        def model = controller.create()
        assert model.book.properties.chuchu == 'blabla'
    }
}
