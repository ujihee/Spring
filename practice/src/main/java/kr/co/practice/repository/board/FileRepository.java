package kr.co.practice.repository.board;

import kr.co.practice.entity.board.File;
import kr.co.practice.entity.board.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Integer> {
}
