package model;


import java.sql.Time;
import java.util.ArrayList;

public abstract class PackPets extends Animals {
    int countPackPets;
    public PackPets(String name, Time birthday) {
        super(name, birthday);
        countPackPets ++;
    }

    public PackPets(String name, Time birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
        countPackPets ++;
    }

    public int getCountPackPets() {
        return countPackPets;
    }
    
}
