package com.etech.designpattern.patterns.geekific.command.commands;

import com.etech.designpattern.patterns.geekific.command.components.Light;

public record SwitchLightsCommand(Light light) implements Command {
    @Override
    public void execute() {
        light.switchLights();
    }
}
