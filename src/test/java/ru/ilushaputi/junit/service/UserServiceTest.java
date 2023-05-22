package ru.ilushaputi.junit.service;

import org.junit.jupiter.api.*;
import ru.ilushaputi.junit.dto.User;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserServiceTest {
    private UserService userService;

    @BeforeAll
    void init(){
        System.out.println("Before all: " + this);
    }

    @BeforeEach
    void prepare() {
        System.out.println("Before eaCH: " + this);
    }


    @Test
    public void test1(){
//        Assertions.assertTrue(true);
        UserService userService = new UserService();
        List<User> all = userService.getAll();
        Assertions.assertTrue(all.isEmpty(), () -> "all - must be empty");

    }
}
