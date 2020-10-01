//package ir.mvbdx.library.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
////@MappedSuperclass
//@Entity
//@Data @AllArgsConstructor @NoArgsConstructor
//
////public abstract class Author<T extends Author> {
//public class Author {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String name;
//
//    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Book> books = new ArrayList<>();
//}
