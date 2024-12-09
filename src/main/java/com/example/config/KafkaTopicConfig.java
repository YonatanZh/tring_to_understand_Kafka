package com.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic TextTopic(){
        return TopicBuilder.name("text-topic").build();
//        return TopicBuilder.name("text-topic").partitions(2).build();
    }
}
