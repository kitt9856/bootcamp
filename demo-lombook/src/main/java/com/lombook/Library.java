package com.lombook;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
public class Library {
  private  List<Book> books;

  public Library(){
    this.books = new ArrayList<>();
  }

  public int  add(Book book){
    books.add(book);
    return 100;
  }


  @Getter
  @Setter
  @AllArgsConstructor
  @EqualsAndHashCode
  public static class book {
    private int id;
    private String name;
  }
  
}
