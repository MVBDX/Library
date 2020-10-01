package ir.mvbdx.library.dao;

import ir.mvbdx.library.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {

    //need to inject session factory
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Book> getBooks() {
        //get the current hibernate session
        Session session = sessionFactory.getCurrentSession();

        //create a query
        Query<Book> bookQuery = session.createQuery("from Book order by title");

        //execute query and get list
        List<Book> bookList = bookQuery.getResultList();

        //return the list
        return bookList;
    }

    @Override
    public void saveBook(Book theBook) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(theBook);

    }

    @Override
    public Book getBook(long theId) {
        Session session = sessionFactory.getCurrentSession();

        Book theBook = session.get(Book.class, theId);

        return theBook;
    }

    @Override
    public void deleteBook(long theId) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("delete from Book where id=:bookId");
        query.setParameter("bookId", theId);

        query.executeUpdate();

    }
}
