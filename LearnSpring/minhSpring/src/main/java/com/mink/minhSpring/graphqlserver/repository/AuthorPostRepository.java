package com.mink.minhSpring.graphqlserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mink.minhSpring.graphqlserver.model.AuthorPost;

public interface AuthorPostRepository extends JpaRepository<AuthorPost, Long> {

}
