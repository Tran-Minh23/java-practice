package com.example.n1.entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorDataService extends JpaRepository<Author, Long> {
    // @Query("select distinct a from Author a join fetch a.books")
    // List<Author> findAll();
}
