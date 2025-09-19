package kr.co.ch04.dao;

import kr.co.ch04.dto.User1DTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor // 필드주입보다는 생성자 주입이 더 안전한 방식
@Repository //component로 해도 ok
public class User1DAO { //객체로 생성해서 container에 이거 안하면 service에서 new user1해줘야함


    private final JdbcTemplate jdbcTemplate;

    public void insert(User1DTO user1DTO){

        String sql = "INSERT INTO user1 VALUES (?,?,?,?)";

        Object[] params = {
                user1DTO.getUid(),
                user1DTO.getName(),
                user1DTO.getBirth(),
                user1DTO.getAge()
        };
        jdbcTemplate.update(sql,params); //executeUpdate() 실행
    }
    public User1DTO select(String uid){
        String sql = "SELECT * FROM user1 WHERE uid=?";
        return jdbcTemplate.queryForObject(sql, new User1RowMapper(), uid);
    }
    public List<User1DTO> selectAll(){
        String sql = "SELECT * FROM user1";

        return jdbcTemplate.query(sql, new User1RowMapper());
    }
    public void update(User1DTO user1DTO){
        String sql = "UPDATE user1 SET name=?, birth = ?, age=? WHERE uid=?";

        Object[] params = {
                user1DTO.getName(),
                user1DTO.getBirth(),
                user1DTO.getAge(),
                user1DTO.getUid()
        };

        jdbcTemplate.update(sql,params); //executeUpdate() 실행
    }
    public void delete(String uid){
        String sql = "DELETE FROM user1 WHERE uid=?";
        jdbcTemplate.update(sql,uid);
    }

}
