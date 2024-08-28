package com.example.n1.entities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDataService extends JpaRepository<Book, Long> {
}