package live_dinner

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(uri: "home.index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
