package io.github.devopsws.demo.service;

import java.util.Base64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.github.devopsws.demo.model.Message;

@RestController
public class StringService {
    @GetMapping("/lower")
    public String lower(@RequestParam(required = true) String text,
        @RequestParam(required = false) boolean trim) {
        if (trim) {
            text=text.trim();
        }
        return text.toLowerCase();
    }

    @GetMapping("/repeat/{count}")
    public String repeat(@RequestParam(required = true) String text,
        @PathVariable int count) {
        return text.repeat(count);
    }

    @PostMapping("/base64")
    public Message base64(@RequestBody Message message) {
        String encodedString = Base64.getEncoder().encodeToString(message.getMessage().getBytes());
        message.setMessage(encodedString);
        return message;
    }
}
