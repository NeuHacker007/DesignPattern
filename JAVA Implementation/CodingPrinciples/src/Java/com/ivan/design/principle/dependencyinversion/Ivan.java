package com.ivan.design.principle.dependencyinversion;

public class Ivan {

    // setter injection
    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    private ICourse iCourse;

    public void StudySDECourse(){
        this.iCourse.StudyCourse();
    }
}
