package com.helloq;

public  class Robot implements Fightable,Jumpale {
    @Override
    public void hit() {
        System.out.println("I Can hit");
    }

    @Override
    public void defend() {
        System.out.println("I Can defend");
    }

    @Override
    public void jump() {
        System.out.println("I Can jump");
    }
}
