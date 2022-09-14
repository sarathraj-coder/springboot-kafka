package app.ivalley.kakatutorial.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
    @KafkaListener(topics = "topic-1",groupId = "myGroup")
    public void consume(String message ){
        LOGGER.info(String.format(" message received   : %s", message));
    }
}
