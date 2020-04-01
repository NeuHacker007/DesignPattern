package creational.builder.v1;

public class Course {
    private String courseVideo;
    private String coursePPT;
    private String courseArticle;
    private String courseName;
    private String courseQA;


    public String getCourseVideo() {
        return this.courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCoursePPT() {
        return this.coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseArticle() {
        return this.courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseQA() {
        return this.courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }


    @Override
    public String toString() {
        return "{" +
            " courseVideo='" + getCourseVideo() + "'" +
            ", coursePPT='" + getCoursePPT() + "'" +
            ", courseArticle='" + getCourseArticle() + "'" +
            ", courseName='" + getCourseName() + "'" +
            ", courseQA='" + getCourseQA() + "'" +
            "}";
    }
    
}