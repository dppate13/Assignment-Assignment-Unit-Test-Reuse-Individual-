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
public class StudentTest {
    
    Student student = new Student();

	@Test
	public void testStudent() {
		int expected = 0;
		assertEquals(expected, student.type);
	}

	@Test
	public void testCreateCourseMenu() {
		CourseMenu courseMenu = student.createCourseMenu(new Course("CSE565", 0), 0);
		assertTrue(courseMenu instanceof HighLevelCourseMenu);
	}
    
}
