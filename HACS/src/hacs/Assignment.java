package hacs;
/**
 * Title:        HACS
 * Description:  SER594 Homework 3:  Implementing Design Patterns
 * Copyright:    Copyright (c) 2002
 * Company:      Department of Computer Science and Engineering, Michigan State University
 * @author Dirgh Patel
 * @version 1.0
 */
import java.util.*;
import java.text.DateFormat;

public class Assignment {

    protected String assignName;
    protected String strAssignmentFilename;
    protected Date dueDate = new Date();
    protected String assignSpec;
    protected SolutionList theSolutionList = new SolutionList();
    protected Solution suggestSolution = new Solution();


    public Assignment() {
    }

    public Date getDueDate() {

        return dueDate;
    }

    public void setDueDate(Date theDueDate) {
        this.dueDate = theDueDate;
    }

    public void setAssSpec(String theSpec) {
        this.assignSpec = theSpec;
    }

    public String getAssignName() {
        return assignName;
    }

    public void setAssignName(String assignName) {

        this.assignName = assignName;
    }

    public boolean isOverDue() {
        Date today = new Date();
        return today.after(this.dueDate);
    }

    ////add the theSolution to the Solutionlist
    public void addSolution(Solution theSolution) {

        theSolutionList.add(theSolution);
    }

    public SolutionList getTheSolutionList() {
        return theSolutionList;
    }

    public void setTheSolutionList(SolutionList theSolutionList) {
        this.theSolutionList = theSolutionList;
    }

    // return the solution of the give name
    public Solution getSolution(String studentname) {
        SolutionIterator solutionIterator = new SolutionIterator(theSolutionList);
        return solutionIterator.next(studentname);
    }

    public Solution getSugSolution() {
        return suggestSolution;
    }

    public void setSuggestSolution(Solution suggestSolution) {
        this.suggestSolution = suggestSolution;
    }

    public SolutionIterator getSolutionIterator() {
        SolutionIterator solutionIterator = new SolutionIterator(theSolutionList);
        return solutionIterator;
    }

    @Override
    public String toString() {
        return assignName;
    }

    public String getDueDateString() {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        return dateFormat.format(dueDate);
    }

    public void accept(NodeVisitor visitor) {
        visitor.visitAssignment(this);
    }
}