package com.folder.folder.controller;

import com.folder.folder.model.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/folders")
public class ItemController {
    @GetMapping("/items")
    public String listItems(Model model) {
        var lst = new ArrayList<Item>();
        var item1 = new Item();
        item1.setId(1);
        item1.setName("Foler1");

        var item2 = new Item();
        item2.setId(2);
        item2.setName("Foler2");

        var item3 = new Item();
        item3.setId(3);
        item3.setName("Foler3");

        lst.add(item1);
        lst.add(item2);
        lst.add(item3);
        model.addAttribute("tree", lst);
        return "items";
    }
}
