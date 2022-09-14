package com.fastcampus.fastcampus_board2.repository;

import com.fastcampus.fastcampus_board2.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
