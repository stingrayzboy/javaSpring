package com.faraz.demo.repositories;

import com.faraz.demo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
