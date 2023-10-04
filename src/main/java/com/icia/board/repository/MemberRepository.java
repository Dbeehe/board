package com.icia.board.repository;

import com.icia.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<BoardEntity, Long> {

}