package com.example.review.service;

import com.example.review.domain.dto.UserDto;
import com.example.review.domain.dto.UserJoinRequest;

public class UserService {
    public UserDto join(UserJoinRequest request) {
        return new UserDto("", "", "");
    }
}
