package model;

import java.sql.Time;
import java.util.ArrayList;

public class Dog extends Pets {

    public Dog(String name, Time birthday) {
        super(name, birthday);
        commands = new ArrayList<String>();
       
    }

    public Dog(String name, Time birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
       
    }

    
    
}
