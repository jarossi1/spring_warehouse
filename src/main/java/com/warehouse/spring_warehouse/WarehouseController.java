package com.warehouse.spring_warehouse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;





/**
 * Handles the GET requests to the root URL ("/")
 * @return the view of form (HTML page) 
 */
@Controller
public class WarehouseController {
    @GetMapping("/")
    public String getForm() {
        return "form";
    }
    
    /**
     * 
     * @return the view of inventory (HTML page)
     */
    @GetMapping("/inventory")
    public String getInventory() {
        return "inventory";
    }
    
    
}
