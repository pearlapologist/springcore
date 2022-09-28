package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        RockMusic rock1 = context.getBean("rockMusic", RockMusic.class);
        RockMusic rock2 = context.getBean("rockMusic", RockMusic.class);
        System.out.println(rock1==rock2);

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);

        context.close();
    }
}
