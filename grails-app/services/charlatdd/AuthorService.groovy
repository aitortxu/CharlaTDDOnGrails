package charlatdd

class AuthorService {

    static transactional = true

    def getAll() {
        def authors = new AuthorCollection()
        authors.addAll Author.findAll()
        return authors
    }

    def getTotal() {
        Author.count()
    }

    def persist(author) {
        author.save(flush: true, failOnError: true)
    }

    def getOneBySlug(slug) {
        Author.findBySlug(slug)
    }
}
