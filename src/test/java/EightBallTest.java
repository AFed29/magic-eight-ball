import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EightBallTest {

    private EightBall eightBall;

    @Before
    public void before() {
        ArrayList<String> testAnswers = new ArrayList<>();
        testAnswers.add("Most likely");
        testAnswers.add("I don't think so");
        testAnswers.add("Never!");
        this.eightBall = new EightBall(testAnswers);
    }

    @Test
    public void hasNumberOfEntries() {
        assertEquals(3, eightBall.getAnswerCount());
    }

    @Test
    public void getFirstAnswer() {
        assertEquals("Most likely", this.eightBall.getAnswerAtIndex(0));
    }

    @Test
    public void canGetRandom() {
        ArrayList<String> copy = eightBall.getAnswers();
        String randomAnswer = eightBall.getRandomAnswer();
        assertTrue(copy.contains(randomAnswer));
    }

    @Test
    public void canAddAnswer() {
        eightBall.addAnswer("Maybe");
        assertEquals(4, eightBall.getAnswerCount());
    }

    @Test
    public void canRemoveAnswer() {
        eightBall.removeAnswer("Never!");
        assertEquals(2, eightBall.getAnswerCount());
    }
}
