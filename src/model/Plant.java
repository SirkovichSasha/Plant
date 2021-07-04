package model;

import java.util.Objects;

public class Plant {
    private String name;
    private String color;
    private int stebel;
    private int lifeTime;
    private float price;
    private Size size;

    public Plant() {
    }

    public Plant(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Plant(String name, String color, int stebel, int lifeTime, float price) {
        this.name = name;
        this.color = color;
        this.stebel = stebel;
        this.lifeTime = lifeTime;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getStebel() {
        return stebel;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStebel(int stebel) {
        this.stebel = stebel;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", stebel=" + stebel +
                ", lifeTime=" + lifeTime +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant)) return false;
        Plant plant = (Plant) o;
        return getStebel() == plant.getStebel() &&
                getLifeTime() == plant.getLifeTime() &&
                Float.compare(plant.getPrice(), getPrice()) == 0 &&
                getName().equals(plant.getName()) &&
                getColor().equals(plant.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getColor(), getStebel(), getLifeTime(), getPrice());
    }

    //========================Method 1============================
    protected float addPrice(float add){
        return this.getPrice()+add;
    }

    //=======================Method 2=========================

    protected String getPlantColor(){
        return this.getColor();
    }


}
