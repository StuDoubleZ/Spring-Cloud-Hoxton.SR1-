package com.example.streamconsumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;

/*生产者-消费者模型   消费者
* 消息转换 传递User */
//@EnableBinding(value = Sink.class)
//@Slf4j
//public class SinkReceiver3 {
//    @StreamListener(Sink.INPUT)
//    public void receive(User user){
//        log.info("Received: " + user);
//    }
//}
