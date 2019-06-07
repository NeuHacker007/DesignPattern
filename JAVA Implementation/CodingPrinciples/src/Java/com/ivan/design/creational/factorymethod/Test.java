package com.ivan.design.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.GetVideo();
        video.Produce();
    }
}
