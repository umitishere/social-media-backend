package com.umitishere.socialmedia.user.service.impl;

import com.umitishere.socialmedia.user.entity.UserEntity;
import com.umitishere.socialmedia.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {

    @Override
    public List<UserEntity> searchUsers() {
        return null;
    }

}
