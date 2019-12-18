# spring-source-explore
To analyze spring boot source code

----
## Day1 Spring-boot event
They are necessary as follow as
* [spring event](src/main/java/cn/hsiangsun/event/BaseEvent.java)
* [spring listener](src/main/java/cn/hsiangsun/event/BaseEventListener.java)
* [spring event publisher](src/main/java/cn/hsiangsun/event/EventPublisher.java)

Now, you can send your message to the listener after spring application started like [this](src/main/java/cn/hsiangsun/run/RunAfterBootStrap.java)

> Congratulation! You have learned it.

----

## Day2 spring-boot aop & annotation
You should know
* aop advice
* aop joinPoint
* aop execution

![AOP](https://us1.myximage.com/2019/12/18/c466a240daa8b23796785a32d42d2753.png)

### @Retention
1.RetentionPolicy.SOURCE —— will abandon when compile <br>
2.RetentionPolicy.CLASS —— will abandon when JVM work <br>
3.RetentionPolicy.RUNTIME —— live to JVM work <br>

### @Target
1.ElementType.METHOD —— will work in method <br>
2.ElementType.Type —— will work in class <br>



