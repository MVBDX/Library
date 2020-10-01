package ir.mvbdx.library.service;

import ir.mvbdx.library.dao.BookDAO;
import ir.mvbdx.library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Override
    @Transactional
    public List<Book> getBooks() {
        return bookDAO.getBooks();
    }

    @Override
    @Transactional
    public void saveBook(Book theBook) {
        bookDAO.saveBook(theBook);
    }

    @Override
    @Transactional
    public Book getBook(long theId) {
        return bookDAO.getBook(theId);
    }

    @Override
    @Transactional
    public void deleteBook(long theId) {
        bookDAO.deleteBook(theId);
    }
}
