package model;

import java.sql.Time;
import java.util.ArrayList;

public class Horse extends PackPets {

    public Horse(String name, Time birthday) {
        super(name, birthday);
        commands = new ArrayList<String>();
       
    }

    public Horse(String name, Time birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
       
    }

    
    
}
