package week4;

import org.junit.jupiter.api.Test;

class FitnessTrackerTest {
    @Test
    public void test1() {
        FitnessTracker tracker = new FitnessTracker("swimming", 30, 2019, 9, 10);
        System.out.println("activity is " + tracker.getFitnessActivity() +
                " and participation time is " + tracker.getParticipationTime() + " mins");
        tracker.getDate();
    }

}