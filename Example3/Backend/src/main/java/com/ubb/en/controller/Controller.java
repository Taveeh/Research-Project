package com.ubb.en.controller;

import com.ubb.en.model.Word;
import com.ubb.en.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/word")
public class Controller {
    @Autowired
    Repository repository;

    @GetMapping("/{word}")
    public ResponseEntity<List<String>> get(@PathVariable String word) {
        return new ResponseEntity<>(repository.getWordBySubword(word).stream().map(Word::getWord).collect(Collectors.toList()), HttpStatus.OK);
    }
}
