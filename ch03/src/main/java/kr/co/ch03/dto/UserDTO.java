package kr.co.ch03.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor //arge가 없는 기본 생성자 arge-argument-매개변수
@AllArgsConstructor
@Builder
public class UserDTO {

    private String uid;
    private String name;
    private String birth;
    private int age;

}
