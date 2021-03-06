package com.mystudypeer.mystudypeer.repository;

import com.mystudypeer.mystudypeer.pojo.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> findByPostId(int postId);
}
