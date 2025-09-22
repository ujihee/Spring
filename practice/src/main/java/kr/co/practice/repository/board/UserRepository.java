package kr.co.practice.repository.board;

import kr.co.practice.entity.board.Comment;
import kr.co.practice.entity.board.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
