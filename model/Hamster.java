package model;

import java.sql.Time;
import java.util.ArrayList;

public class Hamster extends Pets {

    public Hamster(String name, Time birthday) {
        super(name, birthday);
        commands = new ArrayList<String>();
       
    }

    public Hamster(String name, Time birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
       
    }

    
    
}
