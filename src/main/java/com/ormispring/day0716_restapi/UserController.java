package com.ormispring.day0716_restapi;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers() {
        // 전체 사용자 목록 조회
        return null;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        // 사용자 생성 로직
        return null;
    }
}