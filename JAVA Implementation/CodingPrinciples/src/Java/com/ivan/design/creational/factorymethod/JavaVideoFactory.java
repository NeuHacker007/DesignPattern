package com.ivan.design.creational.factorymethod;

public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video GetVideo() {
        return new JavaVideo();
    }
}
