package com.brucer.web.admin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminBlogController {

    @GetMapping("/blog")
    public String blog() {
        return "admin/blog";
    }
}
