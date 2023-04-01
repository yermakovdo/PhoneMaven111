package project.Phone.Maven;

import java.util.Scanner;

public class Phone {
    private String number, model;
    private double weight;

    public Phone(String number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model){
        this(number, model, 0);
    }

    public Phone(){
        this("", "", 0);
    }

    public String getNumber(){
        return number;
    }

    public void receiveCall(String name){
        System.out.println(name + " is calling");
    }

    public void receiveCall(String name, String callerNumber){
        System.out.println(name + " is calling " + callerNumber);
    }

    public void sendMessage(String... numbers){
        System.out.println("Send a message to: ");
        for(String number : numbers){
            System.out.println(number + " ");
        }
        System.out.println();
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
}
