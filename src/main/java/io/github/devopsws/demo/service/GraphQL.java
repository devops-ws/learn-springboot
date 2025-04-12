package io.github.devopsws.demo.service;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;
import io.github.devopsws.demo.model.Book;

@Controller
public class GraphQL {
    @QueryMapping
    // @Secured("ROLE_USER")
    // @PreAuthorize("hasRole('USER')")
    public Book bookById(@Argument String id) {
        return Book.getById(id);
    }

    @QueryMapping
    public Book[] books() {
        return Book.allBooks();
    }

    @MutationMapping
    public int addBook(@Argument String name, @Argument int pageCount) {
        return Book.addBook(new Book("", name, pageCount, ""));
    }
}
