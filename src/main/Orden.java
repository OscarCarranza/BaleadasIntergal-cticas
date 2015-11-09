
package main;

import java.sql.Time;
import java.util.ArrayList;

public class Orden {
    
    private int order_number;
    private String client;
    private ArrayList <Dish> orders;
    private double total;
    private long time;

    public Orden(int order_number, String client, ArrayList<Dish> orders, double total, long time) {
        this.order_number = order_number;
        this.client = client;
        this.orders = orders;
        this.total = total;
        this.time = time;
    }

    public int getOrder_number() {
        return order_number;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public ArrayList<Dish> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Dish> orders) {
        this.orders = orders;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "{" + "#" + order_number + '}';
    }
    
    
    
    
}
