package kr.co.ch06.repository;

import kr.co.ch06.entity.Child;
import kr.co.ch06.entity.Parent;
import kr.co.ch06.entity.User1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class User1RepositoryTest {

    @Autowired
    private User1Repository user1Repository;

    @Test
    void findUser1ById() {
        User1 user1 = user1Repository.findUser1ByUserid("asdf");
        System.out.println(user1);
    }

    @Test
    void findUser1ByName() {
        List<User1> list = user1Repository.findUser1ByName("김니닌");
        System.out.println(list);
    }

    @Test
    void findUser1ByNameNot() {
        List<User1> list = user1Repository.findUser1ByNameNot("김유신");
        System.out.println(list);
    }

    @Test
    void findUser1ByIdAndName() {
        User1 user1 = user1Repository.findUser1ByUseridAndName("asdf", "김니닌");
        System.out.println(user1);
    }

    @Test
    void findUser1ByIdOrName() {
        List<User1> list = user1Repository.findUser1ByUseridOrName("asdf", "김유신");
        System.out.println(list);
    }

    @Test
    void findUser1ByAgeGreaterThan() {
        List<User1> list = user1Repository.findUser1ByAgeGreaterThan(10);
        System.out.println(list);
    }

    @Test
    void findUser1ByAgeGreaterThanEqual() {
        List<User1> list = user1Repository.findUser1ByAgeGreaterThanEqual(12);
        System.out.println(list);
    }

    @Test
    void findUser1ByAgeLessThan() {
        List<User1> list = user1Repository.findUser1ByAgeLessThan(12);
        System.out.println(list);
    }

    @Test
    void findUser1ByAgeLessThanEqual() {
        List<User1> list = user1Repository.findUser1ByAgeLessThanEqual(11);
        System.out.println(list);
    }

    @Test
    void findUser1ByAgeBetween() {
        List<User1> list = user1Repository.findUser1ByAgeBetween(10, 12);
        System.out.println(list);
    }

    @Test
    void findUser1ByNameLike() {
        List<User1> list = user1Repository.findUser1ByNameLike("%김%");
        System.out.println(list);
    }

    @Test
    void findUser1ByNameContains() {
        List<User1> list = user1Repository.findUser1ByNameContains("김");
        System.out.println(list);
    }

    @Test
    void findUser1ByNameStartsWith() {
        List<User1> list = user1Repository.findUser1ByNameStartsWith("김");
        System.out.println(list);
    }

    @Test
    void findUser1ByNameEndsWith() {
        List<User1> list = user1Repository.findUser1ByNameEndsWith("닌");
        System.out.println(list);
    }

    @Test
    void findUser1ByOrderByName() {
        List<User1> list = user1Repository.findUser1ByOrderByName();
        System.out.println(list);
    }

    @Test
    void findUser1ByOrderByAgeAsc() {
        List<User1> list = user1Repository.findUser1ByOrderByAgeAsc();
        System.out.println(list);
    }

    @Test
    void findUser1ByOrderByAgeDesc() {
        List<User1> list = user1Repository.findUser1ByOrderByAgeDesc();
        System.out.println(list);
    }

    @Test
    void findUser1ByAgeGreaterThanOrderByAgeDesc() {
        List<User1> list = user1Repository.findUser1ByAgeGreaterThanOrderByAgeDesc(10);
        System.out.println(list);
    }

    @Test
    void countUser1ById() {
        Integer count = user1Repository.countUser1ByUserid("asdf");
        System.out.println(count);
    }

    @Test
    void countUser1ByName() {
        Integer count = user1Repository.countUser1ByName("김니닌");
        System.out.println(count);
    }

    @Autowired
    private ParentRepository parentRepository;
    @Autowired
    private ChildRepository childRepository;
    @Test
    void selectParentJoinChild() {

        Parent parent = Parent.builder().pid("asdf").name("asdf").age(12).build();

        parentRepository.save(parent);

        Child child =  Child.builder().cid("c101").pid("asdf").name("김철수").age(12).build();

        childRepository.save(child);

        List<Object[]> selectedParent = user1Repository.selectParentJoinChild("asdf");
        System.out.println(selectedParent);
    }

}