package model;

import java.sql.Time;
import java.util.ArrayList;

public class Donkey extends PackPets {

    public Donkey(String name, Time birthday) {
        super(name, birthday);
        commands = new ArrayList<String>();
       
    }

    public Donkey(String name, Time birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
       
    }

    
    
}
