package com.sean.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class SpringBootYmlListApplication {

    @Value("${test-list}")
    private List<String> list;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootYmlListApplication.class, args);
    }

    @PostConstruct
    public void test(){
        if(!CollectionUtils.isEmpty(list)){
            list.stream().forEach(System.out::println);
        }
    }

}
