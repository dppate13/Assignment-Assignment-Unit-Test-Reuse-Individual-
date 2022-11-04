/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacs;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dirgh
 */
public class FacadeTest {
    
    Facade facade = new Facade();
    ClassCourseList classCourseList = new ClassCourseList();

	@Test
	public void testSubmitSolution() {
		int expected = 1;
		Assignment assignment = new Assignment();
		Solution theSolution = new Solution();
		facade.submitSolution(assignment, theSolution);
		assertEquals(expected, assignment.getTheSolutionList().size());
	}

	@Test
	public void testCreateUser() {
		UserInfoItem userInfoItem = new UserInfoItem();
		userInfoItem.userType = UserInfoItem.UserType.STUDENT;
		facade.createUser(userInfoItem);
		assertTrue(facade.thePerson instanceof Student);
	}

	@Test
	public void testCreateCourseList() {
		int expected = 3;
		facade.createCourseList();
		assertEquals(expected, facade.theCourseList.size());
	}

	@Test
	public void testAttachCourseToUser() {
		int expected = 2;
		UserInfoItem userInfoItem = new UserInfoItem();
		userInfoItem.userType = UserInfoItem.UserType.STUDENT;
		userInfoItem.strUserName = "nana";
		facade.createUser(userInfoItem);
		facade.createCourseList();
		facade.attachCourseToUser();
		assertEquals(expected, facade.thePerson.getCourseList().size());
	}

    
}
