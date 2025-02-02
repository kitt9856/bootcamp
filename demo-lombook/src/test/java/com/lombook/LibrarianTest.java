package com.lombook;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

//when we test librarian, we assume Library does NOT exists
@ExtendWith(MockitoExtension.class)
public class LibrarianTest {

  @Mock //有@extendwith..才有得用
  private Library library; //空指針

  @Test
  void testAddBook(){
    Mockito.when(this.mockedlibrary.add(new Library.Book(1,"ABC")))
    .thenReturn(1000); //當library被triger

    Librarian librarian = new  Librarian(mockedLibrary);

    //Your test
    int result = librarian.addBook(new Library.Book(1,"ABC"));
    Assertions.assertEquals(1005, result);

    //verify if the above process does really called add(new Library.Book(1,"ABC"))
    verify(mockedLibrary, times(1)).add(new Library.Book(1,"ABC"));



    //用test case鎖住main code 
    //軟件工程學
  }

  
}
