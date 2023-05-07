package com.example.bdd.controller;


import com.example.bdd.data.BookDto;
import com.example.bdd.ports.api.BookServicePort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(originPatterns = "*")
@RequestMapping("api/v1/books")
public class BookController {

    private BookServicePort bookServicePort;

    public BookController(BookServicePort bookServicePort) {
        this.bookServicePort = bookServicePort;
    }

    @PostMapping
    public BookDto addBook(@RequestBody BookDto bookDto) {
        return bookServicePort.addBook(bookDto);
    }

    @PutMapping("/{id}")
    public BookDto updateBook(@PathVariable long id,@RequestBody BookDto bookDto) {
        return bookServicePort.updateBook(bookDto);
    }

    @GetMapping("/{id}")
    public BookDto getBookByID(@PathVariable long id) {
        return bookServicePort.getBookById(id);
    }

    @GetMapping
    public List<BookDto> getAllBooks() {
        return bookServicePort.getBooks();
    }

    @DeleteMapping("/{id}")
    public void deleteBookByID(@PathVariable long id) {
        bookServicePort.deleteBookById(id);
    }
}
