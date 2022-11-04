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
public class ClassCourseListTest {
    
    public ClassCourseListTest() {
    }
    
     @Test 
	  public void testFindCourseByCourseName() 
	  { 
		  ClassCourseList classCourseList = new ClassCourseList();
		  classCourseList.initializeFromFile();
		  Course course =classCourseList.findCourseByCourseName("CSE565");
		  assertEquals(course.getCourseName(),"CSE565"); 
		 }
	 
    
}
