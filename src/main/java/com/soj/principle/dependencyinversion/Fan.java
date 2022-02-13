package com.soj.principle.dependencyinversion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Fan implements Switchable {
    static final Logger logger = LogManager.getLogger(Fan.class.getName());

    @Override
    public String turnOn() {
        return "Fan: Fan turned on...";
    }

    @Override
    public String turnOff() {
        return "Fan: Fan turned off...";
    }
}
