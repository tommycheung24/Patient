package com.example.patient;

public class Eye extends Organ{
    private String color;
    private boolean open;

    //default, no values
    public Eye(){
        super("", "");
        this.color = "";
        this.open = false;
    }
    //ideal, name is to indicate left eye or right eye
    public Eye(String name, String condition, String color, boolean open){
        super(name, condition);
        this.color = color;
        this.open = open;
    }

    //getters
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Color: " + this.getColor());
        System.out.println("Open: " + this.isOpen());
    }
    public String getColor(){
        return this.color;
    }
    public boolean isOpen(){
        return this.open;
    }

    //setters
    public void setColor(String color){
        this.color = color;
    }
    public void setOpen(boolean open){
        this.open = open;
        if(open){
            System.out.println(this.getName() + " Opened");
        }else{
            System.out.println(this.getName() + " Closed");
        }
    }
}
