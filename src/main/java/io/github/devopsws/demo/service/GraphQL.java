package io.github.devopsws.demo.service;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import io.github.devopsws.demo.model.Book;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;

@Controller
public class GraphQL {
    @QueryMapping
    // @Secured("ROLE_USER")
    // @PreAuthorize("hasRole('USER')")
    public Book bookById(@Argument String id) {
        return Book.getById(id);
    }
}
