package com.ivan.design.principle.dependencyinversion;

public class Test {
    public static void main(String[] args) {
        //V2
        //Ivan ivan = new Ivan();
        //ivan.StudySDECourse(new JavaCourse());
        //ivan.StudySDECourse(new PythonCourse());
        //ivan.StudySDECourse(new FECourse());
        /*
        * V3 the constructor injection has limitation, if now I want to study Java Course
        * I have to initial a new instance of ivan to make it work
        */
        //Ivan ivan = new Ivan(new PythonCourse());
        //ivan.StudySDECourse();

        /*
        * V4 is setter injection
        * Here we can call set multiple times and pass in different courses instance
        */
        Ivan ivan = new Ivan();
        ivan.setiCourse(new JavaCourse());
        ivan.StudySDECourse();
        ivan.setiCourse(new FECourse());
        ivan.StudySDECourse();
    }
}
