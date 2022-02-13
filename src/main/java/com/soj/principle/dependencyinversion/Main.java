package com.soj.principle.dependencyinversion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Main {
    static final Logger logger= LogManager.getLogger(Main.class.getName());
    public static void main(String[] args){
        Switchable lightSwitch=new LightBulb();
        Switch bulbPower=new ElectricPowerSwitch(lightSwitch);
        bulbPower.press();
        bulbPower.press();
        bulbPower.press();


        Switchable fanSwitch=new Fan();
        Switch fanPower=new ElectricPowerSwitch(fanSwitch);
        fanPower.press();
        fanPower.press();
        fanPower.press();



    }
}
