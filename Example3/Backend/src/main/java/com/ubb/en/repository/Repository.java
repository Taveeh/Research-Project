package com.ubb.en.repository;

import com.ubb.en.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Repository extends JpaRepository<Word, Long> {
    @Query(value = "select * from Word w where w.word like %:subword%", nativeQuery = true)
    List<Word> getWordBySubword(@Param("subword") String subword);
}
