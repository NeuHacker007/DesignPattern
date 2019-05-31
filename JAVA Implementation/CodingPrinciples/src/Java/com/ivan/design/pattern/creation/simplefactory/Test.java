package com.ivan.design.pattern.creation.simplefactory;

public class Test {
    public static void main(String[] args) {
//
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("python");
//        if (video == null) {
//            return;
//        }
//        video.produce();

//        Video video = new JavaVideo();
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(PythonVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
