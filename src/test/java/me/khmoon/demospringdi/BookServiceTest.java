package me.khmoon.demospringdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceTest {
  BookService bookService = new BookServiceProxy(new DefaultBookService());

  @Test
  public void di() {
    Book book = new Book();
    book.setTitle("spring");
    bookService.rent(book);
  }
}