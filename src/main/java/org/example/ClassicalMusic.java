package org.example;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rapsody";
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
