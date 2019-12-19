package com.example.book.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")

public class BookController {
//  @RequestMapping("/{bookId}")
//  public Book index(long bookId) {
//    return BookRepository.findByID(bookId);
//  }
@RequestMapping("/123")
public String getBookList(){

// List<Book> booksList=new ArrayList<>();
// booksList.add(new Book("javascript","hong"));

   return "666";
 }
}
