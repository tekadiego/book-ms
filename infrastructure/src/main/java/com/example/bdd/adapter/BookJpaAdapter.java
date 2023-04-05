package com.example.bdd.adapter;

import com.example.bdd.data.BookDto;
import com.example.bdd.entity.Book;
import com.example.bdd.mapper.BookMapper;
import com.example.bdd.ports.spi.BookPersistencePort;
import com.example.bdd.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookJpaAdapter implements BookPersistencePort {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;

    @Override
    public BookDto addBook(BookDto bookDto) {
        Book book = bookMapper.toBook(bookDto);

        Book bookSaved = bookRepository.save(book);

        return bookMapper.toBookDto(bookSaved);
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public BookDto updateBook(BookDto bookDto) {
        return addBook(bookDto);
    }

    @Override
    public List<BookDto> getBooks() {
        List<Book> bookList = bookRepository.findAll();

        return bookMapper.toBookDtoList(bookList);
    }

    @Override
    public BookDto getBookById(Long bookId) {
        Optional<Book> book = bookRepository.findById(bookId);

        return book.map(bookMapper::toBookDto).orElse(null);

    }
}
