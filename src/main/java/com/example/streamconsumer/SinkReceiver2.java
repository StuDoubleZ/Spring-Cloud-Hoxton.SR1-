package com.example.streamconsumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;

/*生产者-消费者模型   消费者
* 消息转换 传递User 但是不能传递具体信息*/
//@EnableBinding(value = Sink.class)
//@Slf4j
//public class SinkReceiver2 {
//    @ServiceActivator(inputChannel = Sink.INPUT)
//    public void receive(Object payload){
//        log.info("Received: " + payload);
//    }
//
//
//    @Transformer(inputChannel = Sink.INPUT, outputChannel = Sink.INPUT)
//    public User transform(String message) throws Exception{
//        ObjectMapper objectMapper = new ObjectMapper();
//        User user = objectMapper.readValue(message, User.class);
//        return user;
//    }
//}
