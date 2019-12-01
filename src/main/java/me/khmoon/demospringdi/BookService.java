package me.khmoon.demospringdi;

public interface BookService {
  void rent(Book book);

  void returnBook(Book book);
}
