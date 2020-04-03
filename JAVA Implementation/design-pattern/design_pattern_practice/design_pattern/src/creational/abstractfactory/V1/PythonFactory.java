package creational.abstractfactory.V1;

public class PythonFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        
        return new PythonArticle() ;
    }

}