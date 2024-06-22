package model;

import java.sql.Time;
import java.util.ArrayList;

public class Cat extends Pets {

    public Cat(String name, Time birthday) {
        super(name, birthday);
        commands = new ArrayList<String>();
       
    }

    public Cat(String name, Time birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
       
    }

    
    
}
