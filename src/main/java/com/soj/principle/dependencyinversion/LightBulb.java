package com.soj.principle.dependencyinversion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LightBulb implements Switchable {
    static final Logger logger = LogManager.getLogger(LightBulb.class.getName());

    public String turnOn(){
        return "LightBulb: Bulb turned on...";

    }

    public String  turnOff(){
        return "LightBulb: Bulb turned off...";
    }
}
