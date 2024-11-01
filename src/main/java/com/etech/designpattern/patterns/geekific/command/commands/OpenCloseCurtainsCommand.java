package com.etech.designpattern.patterns.geekific.command.commands;

import com.etech.designpattern.patterns.geekific.command.components.Curtains;

public record OpenCloseCurtainsCommand(Curtains curtains) implements Command{
    @Override
    public void execute() {
        curtains.openClose();
    }
}
