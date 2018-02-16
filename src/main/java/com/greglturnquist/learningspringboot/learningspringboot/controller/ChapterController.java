package com.greglturnquist.learningspringboot.learningspringboot.controller;

import com.greglturnquist.learningspringboot.learningspringboot.domain.Chapter;
import com.greglturnquist.learningspringboot.learningspringboot.repository.ChapterRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChapterController {

    private final ChapterRepository repository;

    public ChapterController(ChapterRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/chapters")
    public Flux<Chapter> listing() {
        return repository.findAll();
    }
}
