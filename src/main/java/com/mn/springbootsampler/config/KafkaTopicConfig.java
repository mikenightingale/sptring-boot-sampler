package com.mn.springbootsampler.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

//@Configuration
//@EnableKafka
public class KafkaTopicConfig {
    @Value("${topic.name}")
    private String topicName;

    @Value(value = "${spring.kafka.bootstrap-servers}")
    private String bootstrapAddress;

    @Bean
    public NewTopic newTopic() {
        return new NewTopic(topicName, 1, (short) 1);
    }
}
