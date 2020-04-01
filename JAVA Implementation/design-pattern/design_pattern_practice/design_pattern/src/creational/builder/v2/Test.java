package creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().courseName("Java").coursePPT("Java PPT").build();

        System.out.println(course);
    }
}