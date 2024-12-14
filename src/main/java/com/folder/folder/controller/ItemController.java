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
//        var lst = new ArrayList<Item>();
//        var files = new ArrayList<Item>();
//        for(int i = 0; i < 10; i ++){
//            var item1 = new Item();
//            item1.setId(i + 1);
//            item1.setName("Foler" + (i + 1));
//            files = new ArrayList<Item>();
//            if(i%2 == 0){
//                for(int ii = 0; ii < 5; ii ++){
//                    var file = new Item();
//                    file.setId((ii + 1) * i + 1);
//                    file.setName("Folder" + (ii + 1));
//                    files.add(file);
//                }
//            }
//            item1.setChildren(files);
//            lst.add(item1);
//        }
//
//        model.addAttribute("tree", lst);
        return "items";
    }
}
