package com.example.patient;

public class Skin extends Organ{
    private String color;
    private int softness;

    //constructers
    public Skin(String name, String condition, String color, int softness){
        super(name, condition);
        this.color = color;
        this.softness = softness;
    }
    public Skin(String condition, String color, int softness){
        super("Skin", condition);
        this.color = color;
        this.softness = softness;
    }

    //getters
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Color: " + this.getColor());
        System.out.println("Softness: " + this.getSoftness());
    }
    public String getColor(){
        return this.color;
    }
    public int getSoftness(){
        return this.softness;
    }

    //setters
    public void setColor(String color){
        this.color = color;
    }
    public void setSoftness(int softness){
        this.softness = softness;
    }
}
