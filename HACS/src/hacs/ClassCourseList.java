package hacs;

import java.util.ArrayList;
import java.io.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Dirgh Patel
 * @version 1.0
 * @version 2.0 update to Java 8
 */

@SuppressWarnings("serial")
public class ClassCourseList extends ArrayList<Course> {

    public ClassCourseList() {
    }

    String courseFile = "CourseInfo.txt";

    @SuppressWarnings({"resource", "empty-statement"})
    // initialize the list by reading from the file.
    public void initializeFromFile() {
        try {
            BufferedReader file;
            String strCourseName = null;
            file = new BufferedReader(new FileReader(courseFile));
            while ((strCourseName = file.readLine()) != null) {
                Course theCourse;
                theCourse = new Course(strCourseName, 0);
                add(theCourse);
            }
        } catch (IOException ee) {
            ;
        }
    }

    public Course findCourseByCourseName(String CourseName) {
        int nCourseCount = size();
        for (int i = 0; i < nCourseCount; i++) {
            Course course;
            course = (Course) get(i);
            if (course.getCourseName().compareTo(CourseName) == 0)
                return course;
        }
        return null;
    }

}