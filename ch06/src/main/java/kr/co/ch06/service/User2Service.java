package kr.co.ch06.service;

import kr.co.ch06.dto.User2DTO;
import kr.co.ch06.entity.User2;
import kr.co.ch06.repository.User2Repository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class User2Service {

    private final User2Repository user2Repository;

    public void save(User2DTO user2DTO) {
        User2 user2 = user2DTO.toEntity();
        user2Repository.save(user2);
    }
    public User2DTO getUser(String userid) {
        Optional<User2> optUser2 = user2Repository.findById(userid);
        if (optUser2.isPresent()) {
            User2 user2 = optUser2.get();
            return user2.toDTO();
        }
        return null;
    }
    public List<User2DTO> getUsers() {
        List<User2> list = user2Repository.findAll();
        List<User2DTO> dtoList = list.stream()
                                    .map(entity -> entity.toDTO())
                                    .collect(Collectors.toList());
        return dtoList;
    }
    public void modify(User2DTO user2DTO) {
        if(user2Repository.existsById(user2DTO.getUserid())) {
            User2 user2 = user2DTO.toEntity();
            user2Repository.save(user2);
        }
    }
    public void delete(String userid) {
        user2Repository.deleteById(userid);
    }
}
