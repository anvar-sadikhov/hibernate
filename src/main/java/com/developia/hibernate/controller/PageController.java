package com.developia.hibernate.controller;


import com.developia.hibernate.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller

public class PageController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/createForm")
    public String createForm(Model model) {
        model.addAttribute("book", new Book());
        return "create";
    }

    @GetMapping("/viewForm")
    public String viewForm(Model model) {
        model.addAttribute("book", new Book());
        return "view";
    }

    @GetMapping("/updateForm")
    public String updateForm(Model model) {
        model.addAttribute("book", new Book());
        return "update";
    }

    @GetMapping("/deleteForm")
    public String deleteForm(Model model) {
        model.addAttribute("book", new Book());
        return "delete";
    }
}
