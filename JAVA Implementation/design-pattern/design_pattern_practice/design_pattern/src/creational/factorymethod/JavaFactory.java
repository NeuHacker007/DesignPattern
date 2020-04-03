package creational.factorymethod;

public class JavaFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

}