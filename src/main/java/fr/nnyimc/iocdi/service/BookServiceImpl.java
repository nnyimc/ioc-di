package fr.nnyimc.iocdi.service;

import fr.nnyimc.iocdi.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService{
    @Override
    public List<Book> findByAuthor(String author) {
        return new ArrayList<>();
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>();
    }
}
