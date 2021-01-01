package com.example.patient;

public class Organ {
    private String condition;
    private String name;

    public Organ(String name, String condition){
        this.name = name;
        this.condition = condition;
    }

    public void getInfo(){
        System.out.println("Name: " + this.getName());
        System.out.println("Condition: " + this.getCondition());
    }

    //getters
    public String getName(){
        return this.name;
    }
    public String getCondition(){
        return this.condition;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setCondition(String condition){
        this.condition = condition;
    }
}

