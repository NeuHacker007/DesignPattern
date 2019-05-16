package com.ivan.design.principle.dependencyinversion;

public class Ivan {

    /*
    *  In this scenario if we want to study other course we have to modify this class a lot to add new method to it
    *  So, we should add an abstract level to reduce the number of modification of this class
    */
    public void StudyJavaCourse(){
        System.out.println("Ivan study Java Course");
    }

    public void StudyPrythonCourse(){
        System.out.println("Ivan study Python Course");
    }
}
