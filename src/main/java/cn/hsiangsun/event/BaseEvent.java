package cn.hsiangsun.event;



import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.lang.NonNull;
import org.springframework.util.Assert;

/*
* Your event
*
* */
@Slf4j
public abstract class BaseEvent extends ApplicationEvent {

    private final Integer userId;

    public BaseEvent(Object source, @NonNull Integer userId) {
        super(source);

        Assert.notNull(userId,"User id not allow null");

        this.userId = userId;
    }

    @NonNull
    public Integer getUserId(){
        log.debug("userId =>{}",userId);
        return userId;
    }

}
