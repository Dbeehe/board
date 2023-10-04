package com.icia.board.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Setter(AccessLevel.PRIVATE)
@Getter
@Table(name = "board_table")
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String boardwriter;

    @Column(nullable = false)
    private String boardtitle;

    @Column(nullable = false)
    private String boardpass;

    @Column
    private String boardcontents;

    @Column
    private String boardhits;
}
