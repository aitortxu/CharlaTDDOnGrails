package charlatdd

import org.junit.Test

class BookTests {
    @Test
    void "sabe transformarse en un mapa"() {
        def book = new Book(title: 'Cocotero')
        def bookAsMap = book.asMap()
        assert bookAsMap.containsKey('title')
        assert bookAsMap.title == 'Cocotero'
        assert bookAsMap.containsKey('authors')
        assert bookAsMap.authors.isEmpty()
    }
}
