package app.ivalley.kakatutorial.kafka;

import app.ivalley.kakatutorial.model.UserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonProducer.class);

    @Autowired
    private KafkaTemplate<String, UserDetails> kafkaTemplate;

    public  KafkaJsonProducer(KafkaTemplate<String, UserDetails> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(UserDetails data){
        LOGGER.info(String.format(" message send   : %s", data.toString()));
       Message<UserDetails> message =   MessageBuilder
                 .withPayload(data)
                 .setHeader(KafkaHeaders.TOPIC,"topic-2")
                 .build();
        kafkaTemplate.send(message);
    }
}
