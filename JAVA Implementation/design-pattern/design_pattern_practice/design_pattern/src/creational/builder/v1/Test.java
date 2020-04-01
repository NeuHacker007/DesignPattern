package creational.builder.v1;

public class Test {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(builder);

        Course course = coach.makeCourse("java", "video", "ppt", "article", "qa");
        System.out.println(course);
        
    }
}