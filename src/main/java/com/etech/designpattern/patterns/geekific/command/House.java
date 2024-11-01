package com.etech.designpattern.patterns.geekific.command;

import com.etech.designpattern.patterns.geekific.command.components.Room;

import java.util.ArrayList;
import java.util.List;

public class House {

    List<Room> rooms;

    public House() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }
}
