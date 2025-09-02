package com.kafka.cab_book_user.service.impl;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.kafka.cab_book_user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @KafkaListener(topics = "location-transfer", groupId = "user-group")
    public void userCabLocation(String location) {
        System.out.println("received from producer "+ location);

    }
}
