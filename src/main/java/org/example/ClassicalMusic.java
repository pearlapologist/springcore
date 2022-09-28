package org.example;

import org.springframework.stereotype.Component;
@Component
public class ClassicalMusic implements Music {
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing destruction");
    }
}
