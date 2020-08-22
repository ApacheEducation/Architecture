package com.athena;

import com.athena.api.IBookLoader;
import com.athena.entity.Book;
import com.onix.AthenaDb;
import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author yanghai
 * @since 2020/8/23 01:21
 */
public class BookLoaderImpl implements IBookLoader {
    @Override
    public Book getBookById(Long id) {
        if (null == id) {
            return null;
        }
        return AthenaDb.DB_BOOKS.stream().filter(it -> Objects.equals(it.getId(), id)).findFirst().orElse(null);
    }

    @Override
    public List<Book> getBookByName(String name) {
        if (StringUtils.isBlank(name)) {
            return Collections.emptyList();
        }
        return AthenaDb.DB_BOOKS.stream().filter(it -> it.getName().contains(name)).collect(Collectors.toList());
    }
}
