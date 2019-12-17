package cn.hsiangsun;

import cn.hsiangsun.run.RunAfterBootStrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    /*
    * Register your boot strap
    * */
    @Bean
    public RunAfterBootStrap strap(){
        return new RunAfterBootStrap();
    }
}
