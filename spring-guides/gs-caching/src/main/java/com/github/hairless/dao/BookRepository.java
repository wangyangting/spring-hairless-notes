package com.github.hairless.dao;

import com.github.hairless.pojo.Book;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
