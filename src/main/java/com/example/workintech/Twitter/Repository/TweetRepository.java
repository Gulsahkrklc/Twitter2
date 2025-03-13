package com.example.workintech.Twitter.Repository;

import com.example.workintech.Twitter.Entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TweetRepository extends JpaRepository<Tweet,Long> {

    List<Tweet>findByUserId(Long userId);

}
