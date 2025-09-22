package kr.co.practice.entity.board;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ano;
    private String title;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author")
    private User user;

    //comment와 양방향
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "article")
    private List<Comment> commentList;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "ano")
    private List<File>  fileList;

    @CreationTimestamp
    private LocalDateTime wdate;
}
