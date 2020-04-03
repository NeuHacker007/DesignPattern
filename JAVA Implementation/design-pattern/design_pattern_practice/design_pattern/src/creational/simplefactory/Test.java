package creational.simplefactory;

public class Test {

    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo("python");

        if (video == null)
            return;
        video.produce();
    }

}