package hacs;

import java.util.Iterator;

/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Dirgh Patel
 * @version 1.0
 */


public final class SolutionIterator implements Iterator<Solution> {
    SolutionList solutionlist;
    //  CurrentSolutionNumber: point to the location before the first element
    int currentSolutionNumber = -1;

    public SolutionIterator() {
    }

    public int getCurrentSolutionNumber() {
        return currentSolutionNumber;
    }

    public SolutionIterator(SolutionList thesolutionlist) {
        solutionlist = thesolutionlist;
        MoveToHead();
    }

    public void MoveToHead() {
        //  CurrentSolutionNumber: point to the location before the first element
        currentSolutionNumber = -1;
    }

    @Override
    public boolean hasNext() {
        int size = solutionlist.size();
        return currentSolutionNumber < size - 1;
    }

    @Override
    public Solution next() {
        if (hasNext() == true) {
            currentSolutionNumber++;
            return solutionlist.get(currentSolutionNumber);
        } else {
            return null;
        }

    }

    /// get the next Solution that fits the Username;
    public Solution next(String UserName) {
        Solution solution;
        solution = (Solution) next();
        while (solution != null) {
            if (UserName.compareTo(solution.getTheAuthor()) == 0) {
                return solution;
            }
            solution = (Solution) next();
        }
        return null;
    }

    @Override
    public void remove() {
        int size = solutionlist.size();
        solutionlist.remove(size - 1);
    }

}