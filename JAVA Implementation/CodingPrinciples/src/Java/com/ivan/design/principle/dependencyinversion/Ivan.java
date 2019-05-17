package com.ivan.design.principle.dependencyinversion;

public class Ivan {

    private ICourse iCourse;

    public Ivan(ICourse iCourse){

        this.iCourse = iCourse;
    }

    public void StudySDECourse(){
        this.iCourse.StudyCourse();
    }
}
