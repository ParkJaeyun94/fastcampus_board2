package com.fastcampus.fastcampus_board2.repository;

import com.fastcampus.fastcampus_board2.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

// command + shift + T
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
