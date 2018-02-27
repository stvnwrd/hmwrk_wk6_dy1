import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MagicEightBallTest {
    private MagicEightBall magicEightBall;

    @Before
    public void before(){
        ArrayList<String> answers = new ArrayList <>();
        answers.add("Signs point to yes");
        answers.add("Reply hazy try again");
        answers.add("Outlook not so good");
        magicEightBall = new MagicEightBall(answers);
    }

    @Test
    public void canAddItem(){
        magicEightBall.add("Aye!");
        assertEquals(1, magicEightBall.getAnswerCount());
    }


    @Test
    public void canGetRandomAnswer(){
        ArrayList results = magicEightBall.getAnswers()
        string randomAnswer = magicEightBall.getRandomAnswer();
        assertTrue(results.contains(randomAnswer));
    }
}
