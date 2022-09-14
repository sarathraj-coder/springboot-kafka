package app.ivalley.kakatutorial.rest;


import app.ivalley.kakatutorial.kafka.KafkaJsonProducer;
import app.ivalley.kakatutorial.kafka.KafkaProducer;
import app.ivalley.kakatutorial.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaRest {

    @Autowired
    KafkaProducer kafkaProducer;

    @Autowired
    KafkaJsonProducer kafkaJsonProducer;

    @GetMapping("/send/{s}")
    public void sendMessage(@PathVariable("s") String s){
        kafkaProducer.sendMessage(s);
    }


    @PostMapping("/send/user")
    public String sendMessage(@RequestBody UserDetails s){
        kafkaJsonProducer.sendMessage(s);
        return "success";
    }
}
