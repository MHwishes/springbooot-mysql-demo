package com.example.book.controllers;

import com.example.book.Repository.BookRepository;
import com.example.book.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")

public class BookController {

  @Autowired
  private BookRepository bookRepository;

  @RequestMapping(value="/",method = RequestMethod.POST)
  public Book save(@RequestBody Book book) {
    return bookRepository.save(book);
  }

  @RequestMapping(value="/",method = RequestMethod.GET)
  public List<Book> getAllBooks() {
    return bookRepository.findAll();
  }

  @RequestMapping("/{bookId}")
  public Optional<Book> findBookByID(@PathVariable Long bookId) {
    return bookRepository.findById(bookId);
  }

  @RequestMapping(value="/{author}",method = RequestMethod.GET)
  public Book findBookByAuthor(@PathVariable String author) {

    return bookRepository.findByAuthor(author);
  }

  @RequestMapping(value="/{bookId}",method = RequestMethod.DELETE)
  public ResponseEntity deleteBook(@PathVariable Long bookId) {
    Optional<Book> book=bookRepository.findById(bookId);
    if(book.isPresent()){
       bookRepository.deleteById(bookId);
    }
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @RequestMapping(value="/{bookId}",method = RequestMethod.PUT)
  public ResponseEntity updateBook(@PathVariable Long bookId,@RequestBody Book book) {
   Book currentBook= bookRepository.findById(bookId).orElse(null);;
   
    if(currentBook==null){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    currentBook.setName(book.getName());
    currentBook.setAuthor(book.getAuthor());
    return new ResponseEntity<>(currentBook,HttpStatus.NO_CONTENT);
  }
}
