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
public class SolutionTest {
    
    public SolutionTest() {
    }
    
    Solution solution = new Solution();

	@Test
	public void testToString() {
		solution.setTheAuthor("DirghPatel");
		solution.setSolutionFileName("SER");
		assertEquals("Dirgh Patel SER grade=0 not reported", solution.toString());
	}

	@Test
	public void testGetGradeString() {
		String expected = "-1";
		assertEquals(expected, solution.getGradeString());
	}

	@Test
	public void testGetGradeInt() {
		int expected = 0;
		assertEquals(expected, solution.getGradeInt());
	}

	@Test
	public void testSetReported() {
		solution.setReported(true);
		assertTrue(solution.isReported());
	}

	@Test
	public void testIsReported() {
		solution.setReported(true);
		assertTrue(solution.isReported());
	}
    
}
