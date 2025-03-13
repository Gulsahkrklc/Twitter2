package com.example.workintech.Twitter.Repository;

import com.example.workintech.Twitter.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Kullanıcı adına göre arama yapacak özel method
    Optional<User> findByUsername(String username);

    // Kullanıcıları en son kaydedilen en üstte olacak şekilde listele
    @Query("SELECT U FROM User u ORDER BY U.id DESC ")
    List<User> findAllUsersOrdered();

}
