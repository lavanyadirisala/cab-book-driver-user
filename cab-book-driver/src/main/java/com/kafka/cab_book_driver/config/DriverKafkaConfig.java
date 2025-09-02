package com.kafka.cab_book_driver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.apache.kafka.clients.admin.NewTopic;

@Configuration
public class DriverKafkaConfig {

    @Bean
    public NewTopic newTopics(){
        return TopicBuilder.name("location-transfer").partitions(3).replicas(1).build();
    }

}
