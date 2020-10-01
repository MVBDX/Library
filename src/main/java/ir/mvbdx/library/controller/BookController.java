package ir.mvbdx.library.controller;

import ir.mvbdx.library.dao.BookDAO;
import ir.mvbdx.library.entity.Book;
import ir.mvbdx.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    //need to inject book service
    @Autowired
    private BookService bookService;

    @GetMapping("/list")
    public String listBooks(Model theModel) {
        //get books from dao
        List<Book> bookList = bookService.getBooks();

        //add books to the model
        theModel.addAttribute("books", bookList);

        return "book/list";
    }

    @GetMapping("/showFormForAdd")
    public String  showFormForAdd(Model theModel){
        //create model attribute to bind form data
        Book theBook = new Book();

        theModel.addAttribute("book", theBook);

        return "book/form";
    }


    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Book theBook){
        bookService.saveBook(theBook);

        return "redirect:/book/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("bookId") long theId, Model theModel){
        //get book from the service
        Book theBook = bookService.getBook(theId);

        //set book as a model attribute to pre-populate the form
        theModel.addAttribute("book", theBook);

        //send over to our form
        return "book/form";

    }

    @GetMapping("/delete")
    public String deleteBook(@RequestParam("bookId") long theId){
        bookService.deleteBook(theId);

        return "redirect:/book/list";
    }

}
