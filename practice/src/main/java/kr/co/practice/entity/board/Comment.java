package kr.co.practice.entity.board;

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
@Table(name = "tb_comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ano")
    private Article article;

    private String content;
    private String author;

    @CreationTimestamp
    private LocalDateTime wdate;
}
