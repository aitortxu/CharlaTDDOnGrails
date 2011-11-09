package charlatdd.bookController.list

import charlatdd.bookController.ListTests
import grails.converters.JSON

class HTMLTests extends ListTests {
    void setUp() {
        super.setUp()
        requestHTMLOutput()
    }

    void tearDown() {
        super.tearDown()
    }

    void test_usa_bookService_para_recuperar_todos_los_Book() {
        gmc.mock(controller.bookService).getAll().returns(books)
        gmc.mock(controller.bookService).getTotal().returns(books.size())
        gmc.play {
            controller.list()
        }
    }

    void test_devuelve_el_modelo_con_los_Book_y_el_total() {
        controller.bookService.metaClass.all = books
        controller.bookService.metaClass.total = books.size()
        def model = controller.list()
        assert model.books == books
        assert model.total == books.size()
    }

    private def requestHTMLOutput() {
        controller.request.format = 'html'
    }



}
