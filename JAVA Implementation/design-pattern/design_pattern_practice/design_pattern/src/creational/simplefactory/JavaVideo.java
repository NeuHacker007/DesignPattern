package creational.simplefactory;

public class JavaVideo implements Video {
    @Override
    public void produce() {
        System.out.println("Java Video");
    }
}