package io.github.devopsws.demo.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/cookies")
public class CookieService {
    @GetMapping("/echo")
    public String cookie(HttpServletRequest request, String name) {
        Cookie[] cookies=        request.getCookies();
        if (cookies == null) {
            return "cookies are empty";
        }

        for (int i = 0; i < cookies.length; i++) {
            if (cookies[i].getName().equals(name)) {
                return cookies[i].getValue();
            }
        }

        return "not found";
    }   
}
