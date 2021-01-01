package com.example.patient;

import java.util.Scanner;

public class Main {
    private static Patient patient;
    static Scanner scanner = new Scanner(System.in);

    public static void intro(){
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        chooseOrgan();
    }
    public static void chooseOrgan(){
        System.out.println("Choose a organ: " +
                "\n\t1. Left Eye" +
                "\n\t2. Right Eye" +
                "\n\t3. Heart" +
                "\n\t4. Stomach" +
                "\n\t5. Skin" +
                "\n\t6-0. Quit");
        int organ = scanner.nextInt();
        selectOrgan(organ);

    }
    public static void selectOrgan(int organ){
        switch(organ){
            case 1:
                eyeOption(true);
                break;
            case 2:
                eyeOption(false);
                break;
            case 3:
                heartOption();
                break;
            case 4:
                stomachOption();
                break;
            case 5:
                skinOption();
                break;
            default:
                return;
        }
        chooseOrgan();
    }

    public static void eyeOption(boolean left){
        //did this so I don't have to write the same code twice for left and right
        Eye temp;
        if(left){
            temp = patient.getLeftEye();
        }else{
            temp = patient.getRightEye();
        }
        temp.getInfo();

        if(temp.isOpen()){
            System.out.println("\t\t1. Close the Eye");
            if(scanner.nextInt() == 1){
                temp.setOpen(false);
            }
        }else{
            System.out.println("\t\t1. Open the eye");
            if(scanner.nextInt() == 1){
                temp.setOpen(true);
            }
        }
    }

    public static void heartOption(){
        //did this so i don't have to write patient.getHeart so many times
        Heart temp = patient.getHeart();
        temp.getInfo();

        System.out.println("\t\t1. Change heart rate");
        if(scanner.nextInt() == 1){
            System.out.println("Enter new heart rate: ");
            int heartRate = scanner.nextInt();
            temp.setRate(heartRate);
            System.out.println("Heart Rate is now " + temp.getRate());
        }
    }
    public static void stomachOption(){
        Stomach temp = patient.getStomach();
        temp.getInfo();

        System.out.println("\t\t1. Digest");
        if(scanner.nextInt() == 1){
            temp.digest();
        }
    }
    public static void skinOption(){
        patient.getSkin().getInfo();
    }


    public static void main(String[] args){
        patient = new Patient("Matthew", 20,
                new Eye("LeftEye", "Short-sighted","Blue", true),
                new Eye("Right Eye","Normal", "Blue", true),
                new Heart("Normal", 65),
                new Stomach("Normal", false),
                new Skin("Burned", "White", 6));

        intro();
        scanner.close();
    }
}
