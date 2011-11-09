import charlatdd.Author

class BootStrap {
    def authorService

    def init = { servletContext ->
        if (0 == authorService.total) {
            println 'Dando de alta algunos autores'
            authorService.persist(new Author(name: 'Charles Dickens', birthYear: 1812))
            authorService.persist(new Author(name: 'Miguel de Cervantes', birthYear: 1547))
        }
    }
    def destroy = {
    }
}
