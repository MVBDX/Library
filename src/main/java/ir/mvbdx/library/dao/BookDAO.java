package ir.mvbdx.library.dao;

import ir.mvbdx.library.entity.Book;

import java.util.List;

public interface BookDAO {
    public List<Book> getBooks();

    void saveBook(Book theBook);

    Book getBook(long theId);

    void deleteBook(long theId);
}
