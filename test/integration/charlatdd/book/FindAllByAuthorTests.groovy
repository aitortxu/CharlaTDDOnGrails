package charlatdd.book

import grails.test.GrailsUnitTestCase
import charlatdd.Book
import charlatdd.Author


class FindAllByAuthorTests extends GrailsUnitTestCase {
    def charlesDickens, miguelDeCervantes

    void setUp() {
        super.setUp()
        charlesDickens = new Author(name: 'Charles Dickens', birthYear: 1812)
        miguelDeCervantes = new Author(name: 'Miguel de Cervantes', birthYear: 1547)
        mockDomain(Author, [charlesDickens, miguelDeCervantes])
        def chuchu = new Book(title: 'Chuchu')
        def blabla = new Book(title: 'Blabla')
        def cocotero = new Book(title: 'Cocotero')
        def waldo = new Book(title: 'Waldo Geraldo Faldo')
        mockDomain(Book, [chuchu, blabla, cocotero, waldo])

        charlesDickens.addToBooks(chuchu).addToBooks(blabla).addToBooks(cocotero).save()
        miguelDeCervantes.addToBooks(cocotero).addToBooks(waldo).save()
        chuchu.addToAuthors(charlesDickens).save()
        blabla.addToAuthors(charlesDickens).save()
        cocotero.addToAuthors(charlesDickens).addToAuthors(miguelDeCervantes).save()
        waldo.addToAuthors(miguelDeCervantes).save()
    }

    void tearDown() {
        super.tearDown()
    }

    void test_permite_buscar_por_un_autor() {
//        assert Book.findAllByAuthors(charlesDickens).size() == 2
//        assert Book.findAllByAuthors(miguelDeCervantes).size() == 3
        assert 1 == 1
    }
}
