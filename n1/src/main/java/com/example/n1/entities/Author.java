package com.example.n1.entities;

import java.util.List;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    @JsonManagedReference
    private List<Book> books;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public List<Book> getBooks() {
        return books;
    }
}
