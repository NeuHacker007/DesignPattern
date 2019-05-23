package com.ivan.design.principle.interfacesegregation;

public class Dog implements IAnimalAction {

    /*
    * In this scenario, dog apparently cannot implement Fly() method in the animal action interface
    * it causes an empty implementation in class who uses animal action interface. this means the IAnimal
    * interface should be broken down to smaller interface. But be careful that too many interfaces e.g. one method one
    * interface, also causing maintenance issue. So, here we need create interfaces in a reasonable level
    */
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
