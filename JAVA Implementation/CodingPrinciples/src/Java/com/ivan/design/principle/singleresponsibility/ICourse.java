package com.ivan.design.principle.singleresponsibility;

public interface ICourse {
    /*
    * In this example, the ICourse interface take two responsibility
    * one is getting the course information. another is managing the class
    * the problem is that if user call unRegisterCourse method, user might not
    * be able to call getCourseName on the same course. There is conflict between these
    * two responsibility. So we'd better to break down them into two interfaces
    */
    String getCourseName(Integer Id);
    byte[] getCourseVideo();

    void registerCourse(Integer Id);
    void unRegisterCourse(Integer Id);
}
