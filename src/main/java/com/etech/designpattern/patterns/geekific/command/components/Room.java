package com.etech.designpattern.patterns.geekific.command.components;

import com.etech.designpattern.patterns.geekific.command.commands.Command;

public class Room extends Component {


    private final Curtains curtains;
    public Room() {
        this.curtains = new Curtains();
    }

   public Curtains getCurtains(){
        return curtains;
   }

   public boolean curtainsOpen(){
        return curtains.isOpen();
   }
}
