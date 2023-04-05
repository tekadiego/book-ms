package com.example.bdd.ports.spi;

import com.example.bdd.data.BookDto;

import java.util.List;

public interface BookPersistencePort {

    BookDto addBook(BookDto bookDto);

    void deleteBookById(Long id);

    BookDto updateBook(BookDto bookDto);

    List<BookDto> getBooks();

    BookDto getBookById(Long bookId);
}
