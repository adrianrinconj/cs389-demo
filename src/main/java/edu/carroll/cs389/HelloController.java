//package main.java.edu.carroll.cs389;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HelloController {
//    @GetMapping("/")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }
//}
//package edu.carroll.cs389;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HelloController {
//    @GetMapping("/hello")
//    public String index() {
//        return "Hello from Spring Boot!";
//    }
//}

package edu.carroll.cs389;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HelloController {
    @GetMapping("/")
    public String index(@RequestParam(value="name", required=false, defaultValue="Student")String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}