import charlatdd.Author
import charlatdd.Book

class BootStrap {
    def authorService
    def bookService

    def init = { servletContext ->
        if (0 == authorService.total) {
            println 'Dando de alta algunos autores y libros'
            def charlesDickens = createCharlesDickens()
            def miguelDeCervantes = createMiguelDeCervantes()
            authorService.persist(charlesDickens)
            authorService.persist(miguelDeCervantes)
        }
    }

    def destroy = {
    }

    private createCharlesDickens() {
        def oliverTwist = createOliverTwist()
        def charlesDickens = new Author()
        charlesDickens.name = 'Charles Dickens'
        charlesDickens.birthYear = 1812
        charlesDickens.addToBooks(oliverTwist)
        return charlesDickens
    }

    private Book createOliverTwist() {
        def oliverTwist = new Book()
        oliverTwist.title = 'Oliver Twist'
        return oliverTwist
    }

    private createMiguelDeCervantes() {
        def elQuijote = createElQuijote()
        def miguelDeCervantes = new Author()
        miguelDeCervantes.name = 'Miguel de Cervantes'
        miguelDeCervantes.birthYear = 1547
        miguelDeCervantes.addToBooks(elQuijote)
        return miguelDeCervantes
    }

    private Book createElQuijote() {
        def elQuijote = new Book()
        elQuijote.title = 'El Quijote de la Mancha'
        return elQuijote
    }
}
