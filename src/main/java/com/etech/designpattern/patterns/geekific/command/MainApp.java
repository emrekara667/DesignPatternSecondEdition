package com.etech.designpattern.patterns.geekific.command;

import com.etech.designpattern.patterns.geekific.command.commands.OpenCloseCurtainsCommand;
import com.etech.designpattern.patterns.geekific.command.commands.SwitchLightsCommand;
import com.etech.designpattern.patterns.geekific.command.components.FloorLamp;
import com.etech.designpattern.patterns.geekific.command.components.Light;
import com.etech.designpattern.patterns.geekific.command.components.Room;

public class MainApp {
    public static void main(String[] args) {
        Room room = new Room();
        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
        room.executeCommand();
        System.out.println(room.curtainsOpen());

        System.out.println("==========================================");

        FloorLamp lamp = new FloorLamp();
        lamp.setCommand(new SwitchLightsCommand(lamp.getLight()));
        lamp.executeCommand();
        System.out.println(lamp.isLightOn());


    }
}
