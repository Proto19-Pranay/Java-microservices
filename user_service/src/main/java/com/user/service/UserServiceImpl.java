package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //fake user list

    List<User> list  = List.of(

            new User(1311L, "Pranay Laad", "54856487"),
            new User(1312L, "Maddy Mandar", "58896091"),
            new User(1314L, "Kesh King", "98977762")
    );

    @Override
    public User getUser(Long id) {
        return this.list.stream()
                        .filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
