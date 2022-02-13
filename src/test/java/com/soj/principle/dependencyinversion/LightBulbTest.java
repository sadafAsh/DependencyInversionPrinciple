package com.soj.principle.dependencyinversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightBulbTest {

    @Test
    void TestToTurnOnLightBulb() {
        Switchable switchable=new LightBulb();
        String actual="LightBulb: Bulb turned on...";
        String expcted=switchable.turnOn();
        Assertions.assertEquals(expcted,actual);
    }
    @Test
    void TestToTurnOffLightBulb() {
        Switchable switchable=new LightBulb();
        String actual="LightBulb: Bulb turned off...";
        String expcted=switchable.turnOff();
        Assertions.assertEquals(expcted,actual);
    }

}