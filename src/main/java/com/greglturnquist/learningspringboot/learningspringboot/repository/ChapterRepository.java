package com.greglturnquist.learningspringboot.learningspringboot.repository;

import com.greglturnquist.learningspringboot.learningspringboot.domain.Chapter;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {
}
