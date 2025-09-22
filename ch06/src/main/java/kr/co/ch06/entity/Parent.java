package kr.co.ch06.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Parent")
public class Parent {

    @Id
    private String pid;
    private String name;
    private int age;


}
