package com.warehouse.spring_warehouse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.warehouse.Constants;
import com.warehouse.WarehouseItem;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;






/**
 * Handles the GET requests to the root URL ("/")
 * @return the view of form (HTML page) 
 */
@Controller
public class WarehouseController {

    List<WarehouseItem> items = new ArrayList<>();

    @GetMapping("/")
    public String getForm(Model model) {
        model.addAttribute("warehouseItem", new WarehouseItem());
        model.addAttribute("categories", Constants.PC_CATEGORIES);

        return "form";
    }
    
    /**
     * 
     * @return the view of inventory (HTML page)
     */
    @GetMapping("/inventory")
    public String getInventory(Model model) {
        model.addAttribute("items", items);
        return "inventory";
    }

    @PostMapping("/submitItem")
    public String handleSubmit(WarehouseItem warehouseItem) {
        items.add(warehouseItem);
        return "redirect:/inventory";
    }
    
    
    
}
