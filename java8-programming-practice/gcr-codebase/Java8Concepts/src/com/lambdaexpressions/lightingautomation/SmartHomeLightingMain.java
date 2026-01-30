package com.lambdaexpressions.lightingautomation;

import java.time.LocalTime;

public class SmartHomeLightingMain {

    public static void main(String[] args) {

        // Motion detected behavior
        LightAction motionTrigger = () -> {
            System.out.println("Motion detected: Turning ON hallway lights at 80% brightness.");
        };

        // Night time behavior
        LightAction nightMode = () -> {
            LocalTime now = LocalTime.now();
            if (now.isAfter(LocalTime.of(18, 0))) {
                System.out.println("Night mode: Lights dimmed to 35% warm tone.");
            } else {
                System.out.println("Day time: Night mode not activated.");
            }
        };

        // Voice command behavior
        LightAction voiceCommand = () -> {
            System.out.println("Voice command received: Switching to party mode lights");
        };


        triggerLight(motionTrigger);
        triggerLight(nightMode);
        triggerLight(voiceCommand);
    }


    public static void triggerLight(LightAction action) {
        action.execute();
    }
}
