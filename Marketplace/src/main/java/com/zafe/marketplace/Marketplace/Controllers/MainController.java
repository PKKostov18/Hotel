package com.zafe.marketplace.Marketplace.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    public String indexPage() {
        return "index";
    }
}
