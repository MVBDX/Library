package ir.mvbdx.library.entity;

import lombok.*;

import javax.persistence.*;
//import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor

public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    //@ManyToOne @JoinColumn(name = "author_id") @ToString.Exclude
    //private Author author;
    //@ManyToOne @JoinColumn(name = "author_id") @ToString.Exclude
    //private AuthorTranslator translator;

    private String originalTitle;
    //@ManyToOne @JoinColumn(name = "publisher_id") @ToString.Exclude
    //private Publisher publisher;
    private int printing;
    private String publishedYear;
    private String originalPubYear;
    private long price;
    //genre_id
    //formatId
    private int pagesNo;
    @Temporal(TemporalType.DATE)
    private Date purchasedDate;
    //private purchasedLocationId
    private String description;
    @Temporal(TemporalType.DATE)
    private Date addedDate;

//    @NotNull(message = "is required")
//    @Size(min = 1, message = "is required")
//    private String lastName;
//
//    @NotNull(message = "is required")
//    @Min(value = 0 , message = "must be greater or equal to 0")
//    @Max(value = 10, message = "must be less than or equal to 10")
//    private Integer freePassess; //use Integer to resolve issue with @NotNull message
//
//    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
}
