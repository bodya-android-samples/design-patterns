package ru.popov.bodya.facade;

public class Workflow {

    private Developer mDeveloper;
    private Job mJob;
    private BugTracker mBugTracker;

    Workflow() {
        mDeveloper = new Developer();
        mJob = new Job();
        mBugTracker = new BugTracker();
    }

    public void solveProblems() {
        mJob.doJob();
        mBugTracker.startSprint();
        mDeveloper.doJobBeforeDeadline(mBugTracker);
    }
}
