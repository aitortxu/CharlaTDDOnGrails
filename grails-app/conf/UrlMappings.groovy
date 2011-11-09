class UrlMappings {

    static mappings = {
        "/bibliografia/$author"(controller: "book", action: "listByAuthor")

        "/$controller/$action?/$id?" { constraints { }}
        "/"(view: "/index")
        "500"(view: "/error")
    }
}
