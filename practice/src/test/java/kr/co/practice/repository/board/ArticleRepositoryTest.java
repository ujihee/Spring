package kr.co.practice.repository.board;

import kr.co.practice.entity.board.Article;
import kr.co.practice.entity.board.Comment;
import kr.co.practice.entity.board.File;
import kr.co.practice.entity.board.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArticleRepositoryTest {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FileRepository fileRepository;

    @Test
    void insertUserTest(){
        User user = User.builder()
                .userid("a101")
                .name("김유신")
                .age(20)
                .build();
        userRepository.save(user);
    }

    @Test
    void insertArticleTest(){

        User user = User.builder()
                .userid("a101")
                .build();

        Article article = Article.builder()
                .title("제목2")
                .content("내용2")
                .user(user)
                .build();
        articleRepository.save(article);
    }

    @Test
    void insertFileTest(){

        Article article = Article.builder().ano(1).build();

        File file = File.builder()
                .oName("하반기 실적.xls")
                .sName("asdf-2233-asd5.xls")
                .article(article)
                .build();
        fileRepository.save(file);
    }

    @Test
    void insertCommentTest(){
        Article article = Article.builder()
                .ano(1)
                .build();

        Comment comment = Comment.builder()
                .content("댓글2")
                .author("a101")
                .article(article)
                .build();
        commentRepository.save(comment);

    }



}