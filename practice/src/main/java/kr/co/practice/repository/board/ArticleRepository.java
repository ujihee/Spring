package kr.co.practice.repository.board;

import kr.co.practice.entity.board.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Integer> {

}
