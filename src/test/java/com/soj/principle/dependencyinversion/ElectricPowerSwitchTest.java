package com.soj.principle.dependencyinversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricPowerSwitchTest {

    @Test
    void testIsOnIsFalse() {
        boolean on = false;
        Switchable lightSwitch = new LightBulb();
        Switch switchlight = new ElectricPowerSwitch(lightSwitch);
        switchlight.isOn();
        Assertions.assertEquals(on, switchlight.isOn());
    }

    @Test
    void testToCheckTheFanSwitchIsOn() {
        Switchable fan = new Fan();
        Switch switchable = new ElectricPowerSwitch(fan);
        String actual = fan.turnOn();
        boolean checkOn = false;
        Assertions.assertEquals(checkOn, switchable.press());
    }

    @Test
    void testToCheckTheFanSwitchOff() {
        Switchable fan = new Fan();
        Switch switchable = new ElectricPowerSwitch(fan);
        String actual = fan.turnOff();
        boolean checkOn = true;
      boolean ans=  switchable.press();
        Assertions.assertNotEquals(checkOn,ans);
    }

}