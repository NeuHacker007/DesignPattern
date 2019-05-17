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
        Ivan ivan = new Ivan(new PythonCourse());
        ivan.StudySDECourse();

    }
}
