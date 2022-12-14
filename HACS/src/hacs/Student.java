package hacs;
/**
 * Title: HACS Description: SER594 Homework 3: Implementing Design Patterns
 * Copyright: Copyright (c) 2002 Company: Department of Computer Science and
 * Engineering, Michigan State University
 *
 * @author Dirgh Patel
 * @version 1.0
 */


public class Student extends Person {

    public Student() {
        type = 0; // type=0: student
    }

    @Override
    public CourseMenu createCourseMenu(Course theCourse, int theLevel) {

        if (theLevel == 0) // 0: Highlevel defined in CourseSelectDlg.
        {
            theCourseMenu = new HighLevelCourseMenu();
        } else { // 1: LowLevel
            theCourseMenu = new LowLevelCourseMenu();
        }
        return theCourseMenu;
    }

    @Override
    public boolean showMenu() {
        super.showMenu();
        showViewButtons();
        showComboxes();
        showRadios();
        show();
        return ifLogout();
    }
}