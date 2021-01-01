package com.example.patient;

public class Stomach extends Organ{
    private boolean empty;

    //constructers
    public Stomach(String name, String condition, boolean empty){
        super(name, condition);
        this.empty = empty;
    }
    //created this because there's usually only one stomach in a human's body
    public Stomach(String condition, boolean empty){
        super("Stomach", condition);
        this.empty = empty;
    }
    //getters
    @Override
    public void getInfo(){
        super.getInfo();
        if(this.isEmpty()){
            System.out.println("Stomach is empty");
        }else{
            System.out.println("Stomach is Full");
        }
    }
    public boolean isEmpty(){
        return this.empty;
    }

    //setters
    public void setEmpty(boolean empty){
        this.empty = empty;
    }

    public void digest(){
        if(this.isEmpty()) {
            System.out.println("Nothing to digest");
        }else{
            System.out.println("Digesting. The stomach is now empty");
            this.setEmpty(true);
        }
    }
}
