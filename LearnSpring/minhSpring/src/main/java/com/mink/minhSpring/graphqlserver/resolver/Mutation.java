package com.mink.minhSpring.graphqlserver.resolver;

import com.mink.minhSpring.graphqlserver.model.Post;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.mink.minhSpring.graphqlserver.model.AuthorPost;
import com.mink.minhSpring.graphqlserver.repository.AuthorPostRepository;
import com.mink.minhSpring.graphqlserver.repository.PostRepository;

import graphql.kickstart.tools.GraphQLMutationResolver;
import jakarta.persistence.EntityNotFoundException;

@Component
public class Mutation implements GraphQLMutationResolver {
    private AuthorPostRepository authorPostRepository;
    private PostRepository postRepository;

    public Mutation(AuthorPostRepository authorPostRepository, PostRepository postRepository) {
        this.authorPostRepository = authorPostRepository;
        this.postRepository = postRepository;
    }

    public AuthorPost createPostAuthor(String name, Integer age) {
        AuthorPost authorPost = new AuthorPost();
        authorPost.setName(name);
        authorPost.setAge(age);

        authorPostRepository.save(authorPost);

        return authorPost;
    }

    public Post createPost(String title, String description, Long authorId) {
        Post post = new Post();
        post.setAuthor(new AuthorPost(authorId));
        post.setTitle(title);
        post.setDescription(description);

        postRepository.save(post);

        return post;
    }

    public boolean deletePost(Long id) {
        postRepository.deleteById(id);
        return true;
    }

    public Post updatePost(Long id, String title, String description) throws EntityNotFoundException {
        Optional<Post> optPost = postRepository.findById(id);

        if (optPost.isPresent()) {
            Post post = optPost.get();

            if (title != null)
                post.setTitle(title);
            if (description != null)
                post.setDescription(description);

            postRepository.save(post);
            return post;
        }

        throw new EntityNotFoundException("Not found Tutorial to update!");
    }

}
