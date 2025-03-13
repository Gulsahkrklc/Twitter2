package com.example.workintech.Twitter.Repository;

import com.example.workintech.Twitter.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {

    // Belirli bir tweet'e ait tüm yorumları getir
    List<Comment>findByTweetId(Long tweetId);

    // Bir tweetin tüm yorumlarını en son yapılan en üstte olacak şekilde getir
    @Query("SELECT c FROM Comment c WHERE c.tweet.id = :tweetId ORDER BY c.id DESC")
    List<Comment> findAllByTweetId(Long tweetId);
}
