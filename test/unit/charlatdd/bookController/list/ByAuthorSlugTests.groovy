package charlatdd.bookController.list

import static org.hamcrest.CoreMatchers.any
import charlatdd.bookController.ListTests

class ByAuthorSlugTests extends ListTests {
    void setUp() {
        super.setUp()
    }

    void tearDown() {
        super.tearDown()
    }

    void test_usa_authorService_para_obtener_el_autor_de_la_URL() {
        gmc.mock(controller.authorService).getOneBySlug(any(String)).returns([books: []])
        controller.params.author = 'cocotero'
        gmc.play {
            controller.listByAuthorSlug()
        }
    }

    void test_renderiza_la_vista_de_listado() {
        controller.authorService.metaClass.getOneBySlug = { slug -> [books: []] }
        controller.params.author = 'cocotero'
        controller.listByAuthorSlug()
        assert controller.modelAndView.viewName == 'list'
    }

    void test_le_pasa_el_modelo_con_la_lista_de_libros_y_el_total_a_la_vista_de_listado() {
        controller.authorService.metaClass.getOneBySlug = { slug -> [books: []] }
        controller.params.author = 'cocotero'
        controller.listByAuthorSlug()
        assert controller.modelAndView.model.books == []
        assert controller.modelAndView.model.total == 0
    }
}
