package creational.factorymethod;

public class Test {

    public static void main(String[] args) {
        VideoFactory factory = new JavaFactory();
        Video video = factory.getVideo();

        if (video == null)
            return;
        video.produce();
    }

}