package com.ivan.design.creational.factorymethod;

public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video GetVideo() {
        return new PythonVideo();
    }
}
