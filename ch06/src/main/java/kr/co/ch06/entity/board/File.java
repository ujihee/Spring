package kr.co.ch06.entity.board;

import jakarta.persistence.*;
import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fno;

    private String oName;
    private String sName;

    /*
    양방향일때 필요
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ano")
    private Article article;
     */

}
