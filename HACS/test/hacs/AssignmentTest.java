/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacs;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dirgh
 */
public class AssignmentTest {
    
    public AssignmentTest() {
    }
    
    
		@Test
		public void testAddAssignment() {
			Assignment assignment = new Assignment();
			assignment.addSolution(new Solution());
			SolutionList solutionList = assignment.getTheSolutionList();
			assertEquals(solutionList.size(), 1);
		}
		
		@Test
		public void testGetSolutionList() {
			Assignment assignment = new Assignment();
			SolutionList solutionList = assignment.getTheSolutionList();
			assertEquals(solutionList.getClass() == SolutionList.class, true);
		}

		@Test
		public void testIsOverDue() {
			Assignment assignment = new Assignment();
			Long currentDate = System.currentTimeMillis();
			assignment.setDueDate(new Date(currentDate));
			boolean isOverDue = assignment.isOverDue();
			assertFalse(isOverDue);
		}

		@Test
		public void testDateFormat() {
			Assignment assignment = new Assignment();
			System.out.println(System.currentTimeMillis());
			Long currentDate = 2571241870172l;
			assignment.setDueDate(new Date(currentDate));
			String dueDateString = assignment.getDueDateString();
			assertEquals(dueDateString, "6/24/51");
		}
		
		
		  @Test 
		  public void testGetSolution() { 
		  Assignment assignment = new Assignment();
		  Solution solution = new Solution(); 
		  solution.setTheAuthor("DirghP");
		  assignment.addSolution(solution); 
		  Solution sampleSolution = assignment.getSolution("DirghP");
		  assertNotNull(sampleSolution); 
		  }
		  
    
}
