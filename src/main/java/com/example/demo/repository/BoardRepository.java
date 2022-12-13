package com.example.demo.repository;

import com.example.demo.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

    List<BoardEntity> findByTitleContaining(String keyword);

    @Modifying
    @Query("update BoardEntity p set p.view = p.view+1 where p.id = :id")
    int updateView(Long id);
}
