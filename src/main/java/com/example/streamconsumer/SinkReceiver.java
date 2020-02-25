package com.example.streamconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

/*生产者-消费者模型   消费者
* 每隔2秒发送时间*/
//@EnableBinding(value = Sink.class)
//@Slf4j
//public class SinkReceiver {
//    @ServiceActivator(inputChannel = Sink.INPUT)
//    public void receive(Object payload){
//        log.info("Received: " + payload);
//    }
//}
