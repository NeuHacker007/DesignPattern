package com.ivan.design.principle.demter;

import java.util.*;

public class Boss {
    public void Command(TeamLeader teamLeader){
        List<Course> courses = new ArrayList<Course>();

        for (int i=0;i<20;i++) {
            courses.add(new Course());
        }
        teamLeader.getCourseNumber(courses);
    }
}
