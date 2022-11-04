package hacs;
/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Dirgh Patel
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 *
 * Update to Java 8
 */
public class Hacs {

    static Facade facade = new Facade();

    public Hacs() {
    }

    public static void main(String[] args) {
        UserInfoItem userinfoitem = new UserInfoItem();
        facade.createCourseList();
        while (true) {
            boolean bExit = false;
            bExit = facade.login(userinfoitem);
            if (bExit)
                break;
            facade.createUser(userinfoitem);
            facade.attachCourseToUser();
            if (userinfoitem.getUserType() == UserInfoItem.UserType.STUDENT) // if is a student remind him of the due date
                facade.remind();
            boolean bLogout = false;
            while (!bLogout) {
                bLogout = facade.selectCourse();
                if (bLogout)
                    break;
                bLogout = facade.courseOperation();
            }
        }
    }
}