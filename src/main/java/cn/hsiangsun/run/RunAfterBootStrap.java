package cn.hsiangsun.run;

import cn.hsiangsun.event.EventPublisher;
import cn.hsiangsun.event.SimpleEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

@Slf4j
public class RunAfterBootStrap implements ApplicationRunner {

    public void run(ApplicationArguments args) throws Exception {
        log.debug("===spring boot bootstrap started===");
        //push event
        EventPublisher.publishEvent(new SimpleEvent(this,110));
    }
}
