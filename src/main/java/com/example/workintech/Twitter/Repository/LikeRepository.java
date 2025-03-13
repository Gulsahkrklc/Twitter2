package com.example.workintech.Twitter.Repository;

import com.example.workintech.Twitter.Entity.Comment;
import com.example.workintech.Twitter.Entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {

    List<Comment> findByTweetId(Long tweetId);
}
