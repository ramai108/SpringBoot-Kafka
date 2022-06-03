package it.kafkatraining.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic myTopic () {
        return TopicBuilder.name("Ramai")
                .build();
    }

    @Bean
    public NewTopic myJsonTopic () {
        return TopicBuilder.name("training_json")
                .build();
    }

}
