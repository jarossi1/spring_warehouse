package com.warehouse.spring_warehouse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




/**
 * Handles the GET requests to the root URL ("/")
 */
@Controller
public class WarehouseController {
    @GetMapping("/")
    public String getForm() {
        return "form";
    }
    
    
}
