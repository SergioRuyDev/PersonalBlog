package com.sergioruy.personalblog.repository;

import com.sergioruy.personalblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
