package io.github.devopsws.demo.service;

import io.github.devopsws.demo.model.Book;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cache")
public class CacheService {

	@GetMapping("")
    @Cacheable("books")
    public Book index(Integer delay) {
        System.out.println("getting book with cache feature");
        if (delay == null) {
            delay = 0;
        }
        try {
            Thread.sleep(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Book book = new Book("book-1", "Effective Java", delay, "author-1");
        return book;
    }
}
