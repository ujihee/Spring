package kr.co.practice.repository.board;

import kr.co.practice.entity.board.Article;
import kr.co.practice.entity.board.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
}
