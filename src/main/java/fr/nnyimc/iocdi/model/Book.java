package fr.nnyimc.iocdi.model;

import lombok.Data;

import java.util.List;

@Data
public class Book {
    private Long id;
    private List<Author> authors;
    private double price;
}
