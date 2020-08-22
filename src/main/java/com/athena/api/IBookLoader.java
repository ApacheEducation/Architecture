package com.athena.api;

import com.athena.entity.Book;

import java.util.List;

/**
 * @author yanghai
 * @since 2020/8/23 00:46
 */
public interface IBookLoader {

    Book getBookById(Long id);

    List<Book> getBookByName(String name);
}
