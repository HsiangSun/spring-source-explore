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