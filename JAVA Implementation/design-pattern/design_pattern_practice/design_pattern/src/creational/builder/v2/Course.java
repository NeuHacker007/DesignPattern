package creational.builder.v2;

public class Course {

    private String courseVideo;
    private String coursePPT;
    private String courseArticle;
    private String courseName;
    private String courseQA;

    public Course(CourseBuilder cb) {
        this.courseVideo = cb.courseVideo;
        this.coursePPT = cb.coursePPT;
        this.courseArticle = cb.courseArticle;
        this.courseName = cb.courseName;
        this.courseQA = cb.courseQA;
    }

    public String getCourseVideo() {
        return this.courseVideo;
    }

    public String getCoursePPT() {
        return this.coursePPT;
    }

    public String getCourseArticle() {
        return this.courseArticle;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getCourseQA() {
        return this.courseQA;
    }

    @Override
    public String toString() {
        return "{" + " CourseVideo='" + getCourseVideo() + "'" + ", CoursePPT='" + getCoursePPT() + "'"
                + ", CourseArticle='" + getCourseArticle() + "'" + ", CourseName='" + getCourseName() + "'"
                + ", CourseQA='" + getCourseQA() + "'" + "}";
    }

    public static class CourseBuilder {
        private String courseVideo;
        private String coursePPT;
        private String courseArticle;
        private String courseName;
        private String courseQA;

        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder coursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder courseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder courseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder courseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}