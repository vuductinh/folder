package com.folder.folder.controller;

import com.folder.folder.model.Item;
import com.folder.folder.model.ItemDetail;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("/get-files")
@RestController
public class ItemApiController {
    @GetMapping(value = "getFiles", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ItemDetail> getFiles(@RequestParam int folderId) {
        // Lấy danh sách file từ service
        var item = new ItemDetail();
        item.setPath("Folder/Folder" + folderId);
        List<Item> files = new ArrayList<>();
        if((folderId - 1) %2 == 0 ) {
            for(int i = 0; i < 10; i ++){
                var item1 = new Item();
                item1.setId(i);
                item1.setName("File" + (i + 1));
                item1.setCreated(new Date());
                item1.setUpdated(new Date());
                files.add(item1);
            }
        }
        else {
            for(int i = 0; i < 5; i ++){
                var item1 = new Item();
                item1.setId(i);
                item1.setName("File" + (i + 1));
                item1.setCreated(new Date());
                item1.setUpdated(new Date());
                files.add(item1);
            }
        }

        item.setFiles(files);
        return ResponseEntity.ok(item);
    }
}
