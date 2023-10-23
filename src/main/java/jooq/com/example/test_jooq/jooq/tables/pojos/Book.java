/*
 * This file is generated by jOOQ.
 */
package com.example.test_jooq.jooq.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer id;
    private final Integer authorId;
    private final String title;

    public Book(Book value) {
        this.id = value.id;
        this.authorId = value.authorId;
        this.title = value.title;
    }

    public Book(
        Integer id,
        Integer authorId,
        String title
    ) {
        this.id = id;
        this.authorId = authorId;
        this.title = title;
    }

    /**
     * Getter for <code>public.book.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.book.author_id</code>.
     */
    public Integer getAuthorId() {
        return this.authorId;
    }

    /**
     * Getter for <code>public.book.title</code>.
     */
    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Book other = (Book) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.authorId == null) {
            if (other.authorId != null)
                return false;
        }
        else if (!this.authorId.equals(other.authorId))
            return false;
        if (this.title == null) {
            if (other.title != null)
                return false;
        }
        else if (!this.title.equals(other.title))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.authorId == null) ? 0 : this.authorId.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Book (");

        sb.append(id);
        sb.append(", ").append(authorId);
        sb.append(", ").append(title);

        sb.append(")");
        return sb.toString();
    }
}
