package com.soj.principle.dependencyinversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FanTest {

    @Test
    void TestToTurnOnFan() {
        Switchable switchable=new Fan();
        String actual="Fan: Fan turned on...";
        String expcted=switchable.turnOn();
        Assertions.assertEquals(expcted,actual);
    }

    @Test
    void TestToTurnOffFan() {
        Switchable switchable=new Fan();
        String actual="Fan: Fan turned off...";
        String expcted=switchable.turnOff();
        Assertions.assertEquals(expcted,actual);
    }
}