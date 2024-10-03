package io.github.devopsws.demo.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class RootService {

    @GetMapping("")
    public String index() {
        return "Let's learn spring boot!";
    }
}
