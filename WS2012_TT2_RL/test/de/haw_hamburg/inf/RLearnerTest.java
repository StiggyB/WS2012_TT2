package de.haw_hamburg.inf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.haw_hamburg.inf.environment.CliffWorld;
import de.haw_hamburg.inf.rl.RLPolicy;
import de.haw_hamburg.inf.rl.RLearner;

public class RLearnerTest {

    private static RLearner learner;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        learner = new RLearner(new CliffWorld());
        learner.setEpisodes(100);
        learner.runTrial();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testRun() {
        CliffWorld playWorld = new CliffWorld();
        RLPolicy policy = learner.getPolicy();
        int newState[] = new int[2];;
        int action = policy.getBestAction(newState = playWorld.getNextState(newState, 2));
        System.out.println("Reward: "+playWorld.getReward(newState, action));
    }

}
