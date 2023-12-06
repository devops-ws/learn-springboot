package io.github.devopsws.demo.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringService {
    @GetMapping("/lower")
    public String lower(@RequestParam(required = true) String text) {
        return text;
    }
}
