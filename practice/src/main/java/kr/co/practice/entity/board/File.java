package kr.co.practice.entity.board;

import jakarta.persistence.*;
import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tb_file")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fno;

    private String sName;
    private String oName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ano")
    private Article article;
}
