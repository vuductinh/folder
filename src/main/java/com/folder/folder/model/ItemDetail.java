package com.folder.folder.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ItemDetail {
    private String path;
    private List<Item> files;
}
