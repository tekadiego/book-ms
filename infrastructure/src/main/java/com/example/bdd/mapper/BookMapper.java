package com.example.bdd.mapper;

import com.example.bdd.data.BookDto;
import com.example.bdd.entity.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

    BookDto toBookDto(Book book);

    Book toBook(BookDto bookDto);

    List<BookDto> toBookDtoList(List<Book> bookList);

    List<Book> toBookList(List<BookDto> BookDtoList);
}
