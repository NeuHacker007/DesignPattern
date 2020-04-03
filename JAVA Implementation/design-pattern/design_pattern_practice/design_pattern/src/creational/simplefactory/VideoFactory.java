package creational.simplefactory;

public class VideoFactory {

    public Video getVideo(String type) {
        switch (type.toLowerCase()) {
            case "java":
                return new JavaVideo();
            case "python":
                return new PythonVideo();
            default:
                return null;
        }

    }

}