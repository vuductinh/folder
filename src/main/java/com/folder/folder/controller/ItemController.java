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
        var files = new ArrayList<Item>();
        for(var i = 0; i < 10; i ++){
            var item1 = new Item();
            if(i%2 == 0){
                item1.setId(i);
                item1.setName("Foler" + i + 1);
            }else {
                for(var ii = 0; ii < 5; ii ++){
                    var file = new Item();
                    file.setId(ii);
                    file.setName("File" + ii + 1);
                    files.add(file);
                }
                item1.setFiles(files);
            }
            lst.add(item1);
        }

        model.addAttribute("tree", lst);
        return "items";
    }
}
