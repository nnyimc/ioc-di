package fr.nnyimc.iocdi.model;

import lombok.Data;

import java.util.List;

@Data
public class Author {
    private String firstnae;
    private String name;
    private List<Book> books;
}
