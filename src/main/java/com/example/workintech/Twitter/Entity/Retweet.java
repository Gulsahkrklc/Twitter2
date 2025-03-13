package com.example.workintech.Twitter.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="retweet", schema="public")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Retweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="retweet_id")
    private Long id;

}
