package com.folder.folder.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Data
public class Item {
    private int id;
    private String name;
    private List<Item> children;
    private List<Item> files;
    private Date created;
    private Date updated;
}
