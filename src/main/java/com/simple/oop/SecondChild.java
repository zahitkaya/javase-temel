package com.simple.oop;

public class SecondChild extends  Parent{
    public SecondChild() {
    }

    public SecondChild(String action) {
        super(action);
    }

    @Override
    String getAction() {
        return "İkinci çocuk "+ super.getAction();
    }
}
