package model;

import java.sql.Time;
import java.util.ArrayList;

public class Camel extends PackPets {

    public Camel(String name, Time birthday) {
        super(name, birthday);
        commands = new ArrayList<String>();
       
    }

    public Camel(String name, Time birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
       
    }

    
    
}