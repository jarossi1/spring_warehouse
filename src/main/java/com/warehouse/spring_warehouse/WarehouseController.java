package com.warehouse.spring_warehouse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import com.warehouse.Constants;
import com.warehouse.WarehouseItem;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;






/**
 * Handles the GET requests to the root URL ("/")
 * @return the view of form (HTML page) 
 */
@Controller
public class WarehouseController {

    List<WarehouseItem> items = new ArrayList<>();

    @GetMapping("/")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        int index =  getIndexFromId(id);
        model.addAttribute("warehouseItem", index == Constants.NOT_FOUND ?  new WarehouseItem() : items.get(index));
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
    public String handleSubmit(@Valid WarehouseItem warehouseItem, BindingResult result, RedirectAttributes redirectAttributes, Model model) {
        System.out.println("has errors?: " + result.hasErrors());
        
        if (warehouseItem.getCategory() == null || warehouseItem.getCategory().isEmpty()) {
            result.rejectValue("category", "error.category", "Category cannot be blank");   
        }
        if (result.hasErrors()) {
            model.addAttribute("categories", Constants.PC_CATEGORIES);
            return "form";
        } 
        
        int index = getIndexFromId(warehouseItem.getId());
        String status = Constants.SUCCESS_STATUS;
        if (index == Constants.NOT_FOUND) {
            items.add(warehouseItem);
        } else {
            items.set(index, warehouseItem);
        }
        redirectAttributes.addFlashAttribute("status", status);
        return "redirect:/inventory";
    }
    
    
    public int getIndexFromId(String id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) return i;
        }
        return Constants.NOT_FOUND;
    }



    
}
