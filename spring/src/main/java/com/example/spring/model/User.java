package com.example.spring.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data   //lombok
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "user")  //table name
public class User {

    @Id //pk
    @Column(name = "id", length = 20)
    private String id;

    @Column(name = "password", length = 20, nullable = false)
    private String password;

    @Column(name = "nickname", unique = true, length = 20, nullable = false)
    private String nickname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;
}



