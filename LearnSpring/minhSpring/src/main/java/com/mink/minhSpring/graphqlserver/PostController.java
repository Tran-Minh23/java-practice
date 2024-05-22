package com.mink.minhSpring.graphqlserver;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {

    // private PostDao postDao;

    // @QueryMapping
    // public List<Post> recentPosts(@Argument int count, @Argument int offset) {
    // return postDao.getRecentPosts(count, offset);
    // }

    // @SchemaMapping
    // public Author author(Post post) {
    // return authorDao.getAuthor(post.getAuthorId());
    // }

    // @MutationMapping
    // public Post createPost(@Argument String title, @Argument String text,
    // @Argument String category, @Argument String authorId) {

    // Post post = new Post();
    // post.setId(UUID.randomUUID().toString());
    // post.setTitle(title);
    // post.setText(text);
    // post.setCategory(category);
    // post.setAuthorId(authorId);

    // postDao.savePost(post);

    // return post;
    // }
}
