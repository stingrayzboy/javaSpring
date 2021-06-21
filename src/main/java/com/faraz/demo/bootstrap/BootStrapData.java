package com.faraz.demo.bootstrap;

import com.faraz.demo.domain.Author;
import com.faraz.demo.domain.Book;
import com.faraz.demo.repositories.AuthorRepository;
import com.faraz.demo.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric","Evans");
        Book book = new Book("Domain Design","112255448");
        eric.getBooks().add(book);
        book.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(book);


        Author bob = new Author("Bob","Marley");
        Book book2 = new Book("Aur hum naa mare?","112255665448");
        bob.getBooks().add(book2);
        book2.getAuthors().add(bob);

        System.out.println("Start Bootstrap");
        System.out.println("Number of Books: "+ bookRepository.count());

    }
}
