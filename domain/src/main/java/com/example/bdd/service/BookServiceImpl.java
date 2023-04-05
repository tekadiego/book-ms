package com.example.bdd.service;

import com.example.bdd.data.BookDto;
import com.example.bdd.ports.api.BookServicePort;
import com.example.bdd.ports.spi.BookPersistencePort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class BookServiceImpl implements BookServicePort {

    private BookPersistencePort bookPersistencePort;

    @Override
    public BookDto addBook(BookDto bookDto) {
        return  bookPersistencePort.addBook(bookDto);
    }

    @Override
    public void deleteBookById(Long id) {
        bookPersistencePort.deleteBookById(id);
    }

    @Override
    public BookDto updateBook(BookDto bookDto) {
        return bookPersistencePort.updateBook(bookDto);
    }

    @Override
    public List<BookDto> getBooks() {
        return bookPersistencePort.getBooks();
    }

    @Override
    public BookDto getBookById(Long bookId) {
        return bookPersistencePort.getBookById(bookId);
    }
}
