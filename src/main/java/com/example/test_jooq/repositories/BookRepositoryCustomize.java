package com.example.test_jooq.repositories;

import com.example.test_jooq.jooq.tables.pojos.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookRepositoryCustomize implements IBookRepositoryCustomize {

    @PersistenceContext
    private final EntityManager entityManager;

    private final DSLContext dslContext;

    @Override
    public com.example.test_jooq.entyties.Book jooqGetAllBooks() {
        Book book = dslContext.selectFrom(com.example.test_jooq.jooq.tables.Book.BOOK)
                .where(com.example.test_jooq.jooq.tables.Book.BOOK.TITLE.eq("1984"))
                .fetchOneInto(Book.class);

        com.example.test_jooq.entyties.Book bookEntity = new com.example.test_jooq.entyties.Book();
        if (book != null) {
            bookEntity.setTitle(book.getTitle());
        }

        return  bookEntity;
    }
}
