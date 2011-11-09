package charlatdd

import grails.converters.JSON

class BookController {
    def bookService
    def authorService

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index = { }

    def list = {
        withFormat {
            html {
                return [books: bookService.all, total: bookService.total]
            }
            json {
                return render([books: bookService.all.asMap()] as JSON)
            }
        }
    }

    def listByAuthorSlug = {
        def author = authorService.getOneBySlug(params.authorSlug)
        return render(view: 'list', model: [books: author.books, total: author.books.size(), author: author])
    }

    def create = {
        def book = new Book()
        book.properties = params
        return [book: book, authors: authorService.all]
    }

    def save = {
        def book = new Book(params)
        if (!book.validate())
            return render(view: 'create', model: [book: book, authors: authorService.all])

        bookService.persist(book)
        flash.message = "Libro creado satisfactoriamente (ID: ${book.id})"
        return redirect(action: 'list')
    }

}
