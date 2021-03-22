package fr.nnyimc.iocdi.service;

import fr.nnyimc.iocdi.model.Book;

import java.util.List;

public interface BookService {
    public List<Book> findByAuthor(String author);
    public List<Book> findAll();
}
