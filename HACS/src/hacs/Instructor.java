package hacs;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Dirgh Patel
 * @version 1.0
 */

public class Instructor extends Person {
    public Instructor() {

        type = 1; // type=1 :instructor
    }

    @Override
    public CourseMenu createCourseMenu(Course theCourse, int theLevel) {
        if (theLevel == 0) {
            theCourseMenu = new HighLevelCourseMenu();
        } else {
            theCourseMenu = new LowLevelCourseMenu();
        }
        return theCourseMenu;
    }

    @Override
    public boolean showMenu() {
        super.showMenu();
        showAddButton();
        showViewButtons();
        showComboxes();
        showRadios();
        show();
        return ifLogout();
    }
}