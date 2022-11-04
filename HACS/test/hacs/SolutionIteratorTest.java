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
public class SolutionIteratorTest {
    
    SolutionList solutionList = new SolutionList();
	Solution solution = new Solution();

	@Test
	public void testSolutionIterator() {
		new SolutionIterator();
	}

	@Test
	public void testSolutionIteratorSolutionList() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertTrue(solutionIterator.hasNext());
	}

	@Test
	public void testMoveToHead() {
		int expected = -1;
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		solutionIterator.MoveToHead();
		assertEquals(expected, solutionIterator.getCurrentSolutionNumber());
	}

	@Test
	public void testHasNext() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertTrue(solutionIterator.hasNext());
	}

	@Test
	public void testNext() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertNotNull(solutionIterator.next());
	}

	@Test
	public void testNextString() {
		solution.setTheAuthor("Harsh Nagoriya");
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertNotNull(solutionIterator.next("Harsh Nagoriya"));
	}

	@Test
	public void testRemove() {
		int expected = 0;
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		solutionIterator.next();
		solutionIterator.remove();
		assertEquals(expected, solutionIterator.solutionlist.size());
	}
    
}
