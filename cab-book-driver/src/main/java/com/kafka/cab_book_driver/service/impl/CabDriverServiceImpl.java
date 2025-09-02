package com.kafka.cab_book_driver.service.impl;

import com.kafka.cab_book_driver.service.CabDriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabDriverServiceImpl implements CabDriverService {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    @Override
    public boolean updateLocation() {
        kafkaTemplate.send("location-transfer", "Location");
        return true;
    }
}
