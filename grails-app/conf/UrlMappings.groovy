class UrlMappings {

    static mappings = {
        "/books/by/$authorSlug"(controller: "book", action: "listByAuthorSlug")

        "/$controller/$action?/$id?" { constraints { }}
        "/"(view: "/index")
        "500"(view: "/error")
    }
}
