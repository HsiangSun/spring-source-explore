package cn.hsiangsun.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/*
* Event publisher, which you can send message to the listener
* */
@Component
public class EventPublisher implements ApplicationEventPublisherAware {

    private static ApplicationEventPublisher applicationEventPublisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        EventPublisher.applicationEventPublisher = applicationEventPublisher;
    }

    public static void publishEvent(ApplicationEvent applicationEvent) {
        applicationEventPublisher.publishEvent(applicationEvent);
    }
}

