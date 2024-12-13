package com.folder.folder.model;

import lombok.Data;

import java.util.List;

@Data
public class Item {
    private int id;
    private String name;
    private List<Item> children;
    private List<Item> files;
}
