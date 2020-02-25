package com.example.streamconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/*生产者-消费者模型   消费者
* 消息转换 传递User 消费组分区*/
//@EnableBinding(value = Sink.class)
//@Slf4j
//public class SinkReceiver4 {
//    @StreamListener(Sink.INPUT)
//    public void receive(User user){
//        log.info("Received: " + user);
//    }
//}
