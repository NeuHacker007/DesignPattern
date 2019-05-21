package com.ivan.design.principle.singleresponsibility;

public class Bird {
    public void mainBehaviorMode(String birdName) {
        /*
        * In this case, if we want add more birds with special behavior mode, we have to
        * add multiple condition check here to make it work right. So, it violates the single responsibility
        */
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "walk with feet");
        } else {
            System.out.println(birdName + "fly with wings");
        }
    }
}
