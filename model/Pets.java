package model;

import java.sql.Time;
import java.util.ArrayList;

public abstract class Pets extends Animals {
    int countPets;
    public Pets(String name, Time birthday) {
        super(name, birthday);
        countPets ++;
    }

    public Pets(String name, Time birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
        countPets ++;
    }

    public int getCountPets() {
        return countPets;
    }
    
}
