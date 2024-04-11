package io.github.devopsws.demo.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import io.github.devopsws.demo.model.Message;

@RestController
@RequestMapping("/cookies")
public class CookieService {
    @GetMapping("/echo")
    public Message<?> cookie(HttpServletRequest request, String name) {
        Message<String> message = new Message<String>();
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            message.setMessage("cookies are empty");
        } else {
            message.setMessage("not found");

            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals(name)) {
                    message.setMessage(cookies[i].getValue());
                    break;
                }
            }
        }

        return message;
    }   
}
