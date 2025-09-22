package kr.co.ch06.entity.board;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//AUTO_INCREMENT
    private int cno;

    //private int ano;
    // 글하나에 댓글 여러게 1:다 -- 여기 comment기준으로 many to one
    @ManyToOne(fetch = FetchType.LAZY)  // 관계설정
    @JoinColumn(name = "ano")           // FK 이름 설정
    private Article article;

    private String content;
    private String author;

    @CreationTimestamp
    private LocalDateTime wdate;

}
