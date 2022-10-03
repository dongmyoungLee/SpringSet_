package com.example.spring.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "board")
public class Board {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO) //auto increase
    private Long id;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)     //1대 n
    @JoinColumn(name = "user_id")                   //어떤 컬럼으로 조인 할지
    private User user;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "content", length = 1000)
    private String content;


}
