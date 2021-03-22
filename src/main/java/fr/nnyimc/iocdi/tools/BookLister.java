package fr.nnyimc.iocdi.tools;

import fr.nnyimc.iocdi.model.Author;
import fr.nnyimc.iocdi.model.Book;
import fr.nnyimc.iocdi.service.*;

import java.util.ArrayList;
import java.util.List;

public class BookLister {
    private final BookService bookService;
    public BookLister(BookService bookService) {
        this.bookService = bookService;
    }

    public List<Book> findByAuthor(String author) {
        List<Book> books = new ArrayList<>();
        for( Book book: bookService.findAll()) {
            for (Author anAuthor: book.getAuthors()) {
                if (author.equals(anAuthor)){
                    books.add(book);
                }
            }
        }
        return books;
    }
}
