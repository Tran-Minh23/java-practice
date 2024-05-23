package com.mink.minhSpring.graphqlserver.resolver;

import org.springframework.stereotype.Component;

import com.mink.minhSpring.graphqlserver.model.AuthorPost;
import com.mink.minhSpring.graphqlserver.model.Post;
import com.mink.minhSpring.graphqlserver.repository.AuthorPostRepository;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class PostResolver implements GraphQLResolver<Post> {
    private AuthorPostRepository authorPostRepository;

    public PostResolver(AuthorPostRepository authorPostRepository) {
        this.authorPostRepository = authorPostRepository;
    }

    public AuthorPost getAuthor(Post post) {
        return authorPostRepository.findById(post.getAuthor().getId()).orElseThrow(null);
    }
}
