package cn.hsiangsun.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component

/*
* Event listener
* */
public class BaseEventListener {

    @Async
    @EventListener
    public void handEvent(BaseEvent event){
        if (event.getSource() instanceof BaseEvent){
           log.debug("You have a new message from {}",event.getUserId());
        }
        System.out.println( "event has happened and result is "+event.getUserId() );
    }
}
