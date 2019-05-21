package com.ivan.design.principle.singleresponsibility;

public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//          In this case, 鸵鸟 cannot fly which is not make sense
//
//
//        bird.mainBehaviorMode("大雁");
//        bird.mainBehaviorMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.mainBehaviorMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainBehaviorMode("鸵鸟");
        walkBird.mainBehaviorMode("火鸡");

    }
}
