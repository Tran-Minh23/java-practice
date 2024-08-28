package com.mink.minhSpring.graphqlserver.resolver;

import org.springframework.stereotype.Component;

import com.mink.minhSpring.graphqlserver.model.Post;
import com.mink.minhSpring.graphqlserver.model.AuthorPost;
import com.mink.minhSpring.graphqlserver.repository.AuthorPostRepository;
import com.mink.minhSpring.graphqlserver.repository.PostRepository;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {
    private AuthorPostRepository authorPostRepository;
    private PostRepository postRepository;

    public Query(AuthorPostRepository authorPostRepository, PostRepository postRepository) {
        this.authorPostRepository = authorPostRepository;
        this.postRepository = postRepository;
    }

    public Iterable<AuthorPost> findAllPostAuthors() {
        return authorPostRepository.findAll();
    }

    public Iterable<Post> findAllPosts() {
        return postRepository.findAll();
    }

    public long countPostAuthors() {
        return authorPostRepository.count();
    }

    public long countPosts() {
        return postRepository.count();
    }
}
