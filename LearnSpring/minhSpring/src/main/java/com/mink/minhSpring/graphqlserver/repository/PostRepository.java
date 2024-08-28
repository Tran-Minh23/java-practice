package com.mink.minhSpring.graphqlserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mink.minhSpring.graphqlserver.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
