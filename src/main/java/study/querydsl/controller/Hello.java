package study.querydsl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {

    @GetMapping("/hello")
    public String hello() {
        return "안녕?";
    }

}
