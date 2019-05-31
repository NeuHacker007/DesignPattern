package com.ivan.design.pattern.creation.simplefactory;

public class VideoFactory {
    public Video getVideo(String type){
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }
}
