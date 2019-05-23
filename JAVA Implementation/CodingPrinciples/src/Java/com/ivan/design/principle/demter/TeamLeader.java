package com.ivan.design.principle.demter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    void getCourseNumber(){
        List<Course> courses = new ArrayList<Course>();

        for (int i=0;i<20;i++) {
            courses.add(new Course());
        }
        System.out.println("The total number of courses is: " + courses.size());
    }
}
