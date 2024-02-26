package com.ms.email.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;

@Configuration
public class RabbitMQConfig {
    @Value("${broker.queue.email.name}")
    private String queue;

    @Bean
    public org.springframework.amqp.core.Queue queue(){
        return new org.springframework.amqp.core.Queue(queue, true);
    }
    @Bean
    public Jackson2JsonMessageConverter messageCoverter(){
        ObjectMapper objectMapper = new ObjectMapper();
        return new Jackson2JsonMessageConverter(objectMapper);
    }
}
