package com.example.patient;

public class Patient {
    private String name;
    private int age;
    private Eye leftEye;
    private Eye rightEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Patient(String name, int age, Eye leftEye, Eye rightEye, Heart heart, Stomach stomach, Skin skin){
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }
    //getters
    public String getName() {
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public Eye getLeftEye() {
        return this.leftEye;
    }
    public Eye getRightEye() {
        return this.rightEye;
    }
    public Heart getHeart() {
        return this.heart;
    }
    public Stomach getStomach() {
        return this.stomach;
    }
    public Skin getSkin() {
        return this.skin;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setLeftEye(Eye leftEye) {
        this.leftEye = leftEye;
    }
    public void setRightEye(Eye rightEye) {
        this.rightEye = rightEye;
    }
    public void setHeart(Heart heart) {
        this.heart = heart;
    }
    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }
    public void setSkin(Skin skin) {
        this.skin = skin;
    }
}
