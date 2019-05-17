package com.ivan.design.principle.dependencyinversion;

public class Ivan {
    /*
    * Instead of pass in a concrete implementation class, we pass an Interface. So, in this case, we
    * can pass any concrete class which implemented ICourse interface. And, we are not care about the
    * details of which class to study.
    * This injection is method injection, we still can inject to constructor as well
    */
    public void StudySDECourse(ICourse iCourse){
        iCourse.StudyCourse();
    }
}
