package creational.builder.v1;

public class Coach {
    private CourseBuilder builder;

    public void setCourseBuilder(CourseBuilder builder) {
        this.builder = builder;
    }

    public Course makeCourse(String name, String video, String ppt, String article, String qa) {
        this.builder.buildArticle(article);
        this.builder.buildName(name);
        this.builder.buildVideo(video);
        this.builder.buildQA(qa);
        this.builder.buildPPT(ppt);
        return this.builder.makeCourse();
    }

}