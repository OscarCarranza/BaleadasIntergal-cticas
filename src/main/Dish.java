
package main;

import java.sql.Time;
import java.util.ArrayList;

public class Dish {
    
    private String name;
    private String description;
    private double price;
    private long time;
    private ArrayList ingridients;

    public Dish(String name, String description, double price, long time, ArrayList ingridients) {
        this.name = name;
        this.description = description;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public ArrayList getIngridients() {
        return ingridients;
    }

    public void setIngridients(ArrayList ingridients) {
        this.ingridients = ingridients;
    }

    @Override
    public String toString() {
        return "{" + name + '}';
    }
    
    

}