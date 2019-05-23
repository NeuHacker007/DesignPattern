package com.ivan.design.principle.interfacesegregation;

public class Duck implements IEatAction, ISwimAction {
    /*
    * In this scenario we followed interface segregation principle to make the implementation class doesn't need
    * to implement an interface it doesn't need. in this example, the fly() implementation is not needed.
    */
    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
