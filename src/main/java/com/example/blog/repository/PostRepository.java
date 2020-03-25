package com.example.blog.repository;

import com.example.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Stepan Novikov
 */
public interface PostRepository extends CrudRepository<Post, Long> {
}
