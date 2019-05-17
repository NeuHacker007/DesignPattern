package com.ivan.design.principle.dependencyinversion;

public class Test {
    public static void main(String[] args) {
        /*
        * In this case, if we want to add new course, we don't need to modify the ivan class, the ICourse interface, and
        * the concrete course implementation class. The only thing we should to do is to add a new class for new course
        * which implements the ICourse interface. For example, we current want to add a FE course then, we add new class
        * of FECourse and call from here
        */
        Ivan ivan = new Ivan();
        ivan.StudySDECourse(new JavaCourse());
        ivan.StudySDECourse(new PythonCourse());
        ivan.StudySDECourse(new FECourse());

    }
}
