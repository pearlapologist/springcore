package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing initialization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing destruction");
    }
}
