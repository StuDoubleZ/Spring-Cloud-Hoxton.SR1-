package com.example.streamconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
//import org.springframework.cloud.stream.annotation.rxjava.EnableRxJavaProcessor;
//import org.springframework.cloud.stream.annotation.rxjava.RxJavaProcessor;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.SendTo;

//@EnableRxJavaProcessor
//@EnableBinding(value = {Processor.class})
@Slf4j
public class App1 {
//    @StreamListener(Processor.INPUT)
//    @SendTo(Processor.OUTPUT)
//    public Object receiveFromInput(Object payload){
//        log.info("Received: " + payload);
//        return "From Input Channel Return - " + payload;
//    }
    /**原生实现**/

//    @ServiceActivator(inputChannel= Processor.INPUT, outputChannel = Processor.OUTPUT)
//    public Object receiveFromInput(Object payload) {
//        logger.info("Received: " + payload);
//        return "From Input Channel Return - " + payload;
//    }

    /**rxjava实现**/

//    @Bean
//    public RxJavaProcessor<String,String> processor() {
//        return inputStream -> inputStream.map(data -> {
//            log.info("Received: " + data);
//            return data;
//        }).buffer(5).map(data -> String.valueOf("From Input Channel Return - " + data));
//    }
}
