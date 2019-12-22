package com.example.book.controllers;

import com.example.book.Repository.BookRepository;
import com.example.book.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")

public class BookController {

  @Autowired
  private BookRepository bookRepository;

  @RequestMapping(value="/",method = RequestMethod.POST)
  public Book save(@RequestBody Book book) {
    return bookRepository.save(book);
  }

  @RequestMapping("/{bookId}")
  public Book findBookByID(long bookId) {
    return bookRepository.findById(bookId);
  }
}
