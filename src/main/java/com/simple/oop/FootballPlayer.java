package com.simple.oop;

public class FootballPlayer {
    //Encapsulation.
    private String name;
    private String teamName;
    private double weight;
    private int height; // with cm unit


    public FootballPlayer() {

    }

    //Overloading Overload birden fazla constructor olmasıdır.
    public FootballPlayer(String name, String teamName, double weight, int height) {
        this.name = name;
        this.teamName = teamName;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
