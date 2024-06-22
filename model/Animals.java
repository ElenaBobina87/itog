package model;

import java.sql.Time;
import java.util.ArrayList;
 
public abstract class Animals {
    
        protected String name;
        protected Time birthday;
        protected ArrayList<String> commands;

        public Animals(String name, Time birthday) {
            this.name = name;
            this.birthday = birthday;
            this.commands = new ArrayList<String>();
        }

        public Animals(String name, Time birthday,  ArrayList<String> commands) {
            this.name = name;
            this.birthday = birthday;
            this.commands = commands;
        }

        public Time getBirthday() {
            return birthday;
        }

        public ArrayList<String> getCommands() {
            return commands;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
        return "Name: " + this.name + ", Birthday: " + this.birthday + ", Commands: " + this.commands;
        }


        
    }


