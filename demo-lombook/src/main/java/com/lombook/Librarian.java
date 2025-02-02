package com.lombook;

//Librarian object -> Library Object -> Book ArrayList object
public class Librarian {
  private Library library;

  //library provide method to librarian use

  //Dependency Injection
  public Librarian(Library library){
    this.library =library;  //so if library use @noconstur.. 會null library -> 用不到this.library
  }


  //unit test complete?
  //result from others + add value
  public int addBook(Library.Book book){
    return  this.library.add(book) + 5; // +5 增值的地方
  }
  
}
