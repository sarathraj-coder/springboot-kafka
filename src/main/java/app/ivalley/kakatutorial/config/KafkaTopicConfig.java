package app.ivalley.kakatutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic ivalleyTopic(){
         return TopicBuilder.name("topic-1")
                 .build();
    }


    @Bean
    public NewTopic ivalleyTopicJson(){
        return TopicBuilder.name("topic-2")
                .build();
    }
}
