package com.smartwomen.app.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerController {
    @RequestMapping(value = {"/", "/swagger"})
    public String swaggerRedirect() {
        return "redirect:/swagger-ui.html";
    }
}
