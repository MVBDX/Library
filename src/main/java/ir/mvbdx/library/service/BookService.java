package ir.mvbdx.library.service;

import ir.mvbdx.library.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getBooks();

    void saveBook(Book theBook);

    Book getBook(long theId);

    void deleteBook(long theId);
}
