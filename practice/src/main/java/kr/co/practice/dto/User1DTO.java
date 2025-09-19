package kr.co.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User1DTO {
    private String user_id;
    private String name;
    private String hp;
    private int age;
}
