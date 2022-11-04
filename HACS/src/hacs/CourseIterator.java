package hacs;

import java.util.Iterator;

/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Dirgh Patel
 * @version 1.0
 */

public class CourseIterator implements Iterator<Course> {
    private ClassCourseList theCourseList;
    private int currentCourseNumber = -1;

    public CourseIterator() {
    }

    public CourseIterator(ClassCourseList courseList) {
        theCourseList = courseList;
    }

    @Override
    public boolean hasNext() {
        return currentCourseNumber < theCourseList.size() - 1;
    }

    @Override
    public Course next() {
        if (hasNext() == true) {
            currentCourseNumber++;
            return theCourseList.get(currentCourseNumber);
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        int size = theCourseList.size();
        theCourseList.remove(size - 1);
    }

    public Course next(String CourseName) {
        Course course;
        course = (Course) next();
        while (course != null) {
            if (CourseName.compareTo(course.toString()) == 0) {
                return course;
            }
            course = (Course) next();
        }
        return null;
    }

    public ClassCourseList getTheCourseList() {
        return theCourseList;
    }

}