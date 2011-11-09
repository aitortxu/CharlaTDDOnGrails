package charlatdd

import grails.test.GrailsUrlMappingsTestCase

class UrlMappingsTests extends GrailsUrlMappingsTestCase {

    void test_url_para_bibliografia_de_un_autor() {
        assertUrlMapping("/books/by/charles-dickens", controller: "book", action: "listByAuthorSlug") {
            authorSlug = 'charles-dickens'
        }
    }

}
