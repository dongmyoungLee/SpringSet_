package com.example.spring.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "user")
public class User {

    @Id
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



