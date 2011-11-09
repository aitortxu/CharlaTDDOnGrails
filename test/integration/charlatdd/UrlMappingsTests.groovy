package charlatdd

import grails.test.GrailsUrlMappingsTestCase

class UrlMappingTests extends GrailsUrlMappingsTestCase {

    void test_url_para_bibliografia_de_un_autor() {
        assertUrlMapping("/bibliografia/charles-dickens", controller: "book", action: "listByAuthorSlug")
    }

}
