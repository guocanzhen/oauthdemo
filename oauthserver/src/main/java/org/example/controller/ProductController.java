package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guocz
 * @date 2023/2/10 16:00
 */
@RestController
@RequestMapping
public class ProductController {

    @GetMapping("/public/1")
    public String findAll() {
        return "rfgjkoiytfg";
    }

    @GetMapping("/private/1")
    public String find() {
        return "ouyghj";
    }
}
