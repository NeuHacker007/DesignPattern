package creational.builder.v1;

public interface CourseBuilder {
    void buildVideo(String video);
    void buildPPT(String ppt);
    void buildArticle(String article);
    void buildName(String name);
    void buildQA(String qa);

    Course makeCourse();
}