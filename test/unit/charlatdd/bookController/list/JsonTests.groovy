package charlatdd.bookController.list

import charlatdd.bookController.ListTests
import grails.converters.JSON


class JsonTests extends ListTests {
    void setUp() {
        super.setUp()
        requestJSONOutput()
    }

    void tearDown() {
        super.tearDown()
    }

    void test_usa_bookService_para_recuperar_todos_los_Book() {
        gmc.mock(controller.bookService).getAll().returns(books)
        gmc.play {
            controller.list()
        }
    }

    void test_devuelve_un_json() {
        controller.bookService.metaClass.all = books
        controller.list()
        def json = JSON.parse(controller.response.contentAsString)
        assert json.books.size() == 2
    }

    private def requestJSONOutput() {
        controller.request.format = 'json'
    }



}
