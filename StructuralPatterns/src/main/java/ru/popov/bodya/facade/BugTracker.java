package ru.popov.bodya.facade;

public class BugTracker {

    private boolean mActiveSprint;

    public boolean isActiveSprint() {
        return mActiveSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is active");
        mActiveSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint is not active");
        mActiveSprint = false;
    }
}
