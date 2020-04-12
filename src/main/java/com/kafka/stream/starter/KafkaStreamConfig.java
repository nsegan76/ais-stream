package com.kafka.stream.starter;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@Data
@EqualsAndHashCode(callSuper=false)
@ComponentScan(basePackages = "com.kafka.stream")
@Configuration
@EnableKafka
@EnableKafkaStreams
@EnableAutoConfiguration
public class KafkaStreamConfig {
}
