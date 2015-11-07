
package main;

import java.sql.Time;
import java.util.ArrayList;

public class Dish {
    
    private String name;
    private String description;
    private Time time;
    private ArrayList ingridients;

    public Dish(String name, String description, Time time, ArrayList ingridients) {
        this.name = name;
        this.description = description;
        this.time = time;
        this.ingridients = ingridients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public ArrayList getIngridients() {
        return ingridients;
    }

    public void setIngridients(ArrayList ingridients) {
        this.ingridients = ingridients;
    }
    
    
}
