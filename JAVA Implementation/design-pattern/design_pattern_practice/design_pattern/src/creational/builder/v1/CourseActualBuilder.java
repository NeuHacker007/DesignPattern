package creational.builder.v1;

public class CourseActualBuilder implements CourseBuilder{
    Course course = new Course();
    
    @Override
    public void buildVideo(String video) {
       course.setCourseVideo(video);
    }

    @Override
    public void buildPPT(String ppt) {
        course.setCoursePPT(ppt);

    }

    @Override
    public void buildArticle(String article) {
        course.setCourseArticle(article);

    }

    @Override
    public void buildName(String name) {
        course.setCourseName(name);

    }

    @Override
    public void buildQA(String qa) {
        course.setCourseQA(qa);

    }

    @Override
    public Course makeCourse() {
        return course;
    }
    
}