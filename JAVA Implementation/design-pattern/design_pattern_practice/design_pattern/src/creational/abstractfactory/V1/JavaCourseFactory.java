package creational.abstractfactory.V1;

public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaAriticle();
    }

}