package com.example.bdd.controller;


import com.example.bdd.data.BookDto;
import com.example.bdd.ports.api.BookServicePort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/books")
public class BookController {

    private BookServicePort bookServicePort;

    public BookController(BookServicePort bookServicePort) {
        this.bookServicePort = bookServicePort;
    }

    @PostMapping("/add")
    public BookDto addBook(@RequestBody BookDto bookDto) {
        return bookServicePort.addBook(bookDto);
    }

    @PutMapping("/update")
    public BookDto updateBook(@RequestBody BookDto bookDto) {
        return bookServicePort.updateBook(bookDto);
    }

    @GetMapping("/get/{id}")
    public BookDto getBookByID(@PathVariable long id) {
        return bookServicePort.getBookById(id);
    }

    @GetMapping("/get")
    public List<BookDto> getAllBooks() {
        return bookServicePort.getBooks();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBookByID(@PathVariable long id) {
        bookServicePort.deleteBookById(id);
    }
}
