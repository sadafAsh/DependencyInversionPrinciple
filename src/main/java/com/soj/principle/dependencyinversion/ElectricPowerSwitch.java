package com.soj.principle.dependencyinversion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ElectricPowerSwitch implements Switch {
    static final Logger logger= LogManager.getLogger(ElectricPowerSwitch.class.getName());

    private Switchable switchable;
    private boolean on;

    public ElectricPowerSwitch(Switchable switchable) {
        this.switchable = switchable;
       this.on=false;
    }
    public boolean isOn(){
        return this.on;
    }
    public boolean press(){
        boolean checkOn=isOn();
        if (checkOn){
            String turnOff=switchable.turnOff();
           logger.debug( turnOff);
            this.on=false;

        }else {
            String turnOn =switchable.turnOn();
          logger.debug( turnOn);
          this.on=true;
        }return checkOn;
    }
}
