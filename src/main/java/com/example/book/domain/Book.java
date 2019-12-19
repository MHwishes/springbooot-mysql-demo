//package com.example.book.domain;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Book {
//  @Id
//  @GeneratedValue(strategy= GenerationType.AUTO)
//  private Long id;
//  private String name;
//  private String author;
//
//  @Override
//  public String toString() {
//    return String.format(
//        "Book[id=%d, name='%s', author='%s']",
//        id, name, author);
//  }
//  public Long getId() {
//    return id;
//  }
//
//  public void setId(Long id) {
//    this.id = id;
//  }
//
//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public String getAuthor() {
//    return author;
//  }
//
//  public void setAuthor(String author) {
//    this.author = author;
//  }
//}
