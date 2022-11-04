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
public class CourseTest {
    
    public CourseTest() {
    }
    
    @Test
	public void testAddAssignment() {
		Course course = new Course("CSE565", 0);
		course.addAssignment(new Assignment());
		assertEquals(course.getAssignmentList().size(), 1);
	}
    
}
