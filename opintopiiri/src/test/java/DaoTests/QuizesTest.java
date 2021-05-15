/*
 * Tests on quiz1 and quiz2
 */
package DaoTests;

import org.junit.Test;
import static org.junit.Assert.*;
import opintopiiri.dao.Quiz1;
import opintopiiri.dao.Quiz2;

/**
 *
 * @author ksani
 */
public class QuizesTest {

    @Test
    public void testLengthOfQuiz1() {
        Quiz1 quiz1 = new Quiz1();
        assertEquals(quiz1.getLength(), 8);
    }

    @Test
    public void testLengthOfQuiz2() {
        Quiz2 quiz2 = new Quiz2();
        assertEquals(quiz2.getLength(), 8);
    }

}
