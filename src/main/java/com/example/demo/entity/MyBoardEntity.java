package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "board")
public class MyBoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String writer;

}
