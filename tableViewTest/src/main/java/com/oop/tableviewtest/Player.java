package com.oop.tableviewtest;

public class Player {
    private String nameComboBox;
    private int jerseyTextField;

    public Player(String name, int jerseyNo) {
        this.nameComboBox= name;
        this.jerseyTextField = jerseyNo;
    }

    public String getName() {
        return nameComboBox;
    }

    public void setName(String name) {
        this.nameComboBox = name;
    }

    public int getJerseyNo() {
        return jerseyTextField;
    }

    public void setJerseyNo(int jerseyNo) {
        this.jerseyTextField = jerseyNo;
    }

    @Override
    public String toString() {
        return "Player " + nameComboBox +
                " Jersey No. " + jerseyTextField +
                ' ';
    }
}
