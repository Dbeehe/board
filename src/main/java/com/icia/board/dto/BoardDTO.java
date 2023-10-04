package com.icia.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardDTO {
    private Long id;
    private String boardwriter;
    private String boardtitle;
    private String boardpass;
    private String boardcontents;
    private String boardhits;
}
