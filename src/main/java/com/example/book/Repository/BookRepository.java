package com.example.book.Repository;

import com.example.book.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import java.util.List;

public  interface BookRepository extends JpaRepository<Book,Long> {
  Book findById(long id);
  List<Book> findByName(String name);

}
