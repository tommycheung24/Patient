package com.example.patient;

public class Heart extends Organ{
    private int rate;

    //constructors
    public Heart(String name, String condition, int rate){
        super(name, condition);
        this.rate = rate;
    }
    //created this because there's usually only one heart in a human's body
    public Heart(String condition, int rate){
        super("Heart", condition);
        this.rate = rate;
    }

    //getters
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Heart Rate: " + this.getRate());
    }
    public int getRate(){
        return this.rate;
    }
    //setters
    public void setRate(int rate){
        this.rate = rate;
    }
}
