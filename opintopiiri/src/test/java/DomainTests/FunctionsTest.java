/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainTests;

import opintopiiri.domain.Functions;
import opintopiiri.ui.UI;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ksani
 */
public class FunctionsTest {

    @Test
    public void getQ1Question() {
        Functions functions = new Functions(new UI());
        assertEquals(functions.getQ(1), "Are jellyfish a type of fish?                         " + "\n" + "a:Yes " + "\n" + "b:No" + "\n" + "c:Saltwater jellyfishes are " + "\n" + "d: Freshwater jellyfishes are");
    }

    @Test
    public void getQ2Question() {
        Functions functions = new Functions(new UI());
        assertEquals(functions.getQ(2), "Which of these creatures existed at the same time as dinosaurs?      " + "\n" + "a:Neanderthalis humans " + "\n" + "b:Woolly mammoths" + "\n" + "c:Saber-toothed cats" + "\n" + "d:None of these");
    }

    @Test
    public void getQ1Answer() {
        Functions functions = new Functions(new UI());
        assertEquals(functions.getA(1), "c");
    }

    @Test
    public void getQ2Answer() {
        Functions functions = new Functions(new UI());
        assertEquals(functions.getA(2), "b");
    }

    @Test
    public void getQ1AnswerWhenCorrectIndex() {
        Functions functions = new Functions(new UI());
        assertEquals(functions.getA(2), "b");
    }

    @Test
    public void checkIfMoreQuestionsIfIndexBelow8() {
        Functions functions = new Functions(new UI());
        assertEquals(functions.checkIfMoreQs(), true);
    }

    @Test
    public void checkIfMoreQuestionsIfIndexOver8() {
        Functions functions = new Functions(new UI());
        functions.getQ(1);
        functions.getQ(1);
        functions.getQ(1);
        functions.getQ(1);
        functions.getQ(1);
        functions.getQ(1);
        functions.getQ(1);
        functions.getQ(1);
        functions.getQ(1);
        assertEquals(functions.checkIfMoreQs(), false);
    }

    @Test
    public void setIndexesToZero() {
        Functions functions = new Functions(new UI());
        functions.indexToZero();
        assertEquals(functions.toString(), "0 -1 0.0 0.0 0 0");
    }

    @Test
    public void getIndex() {
        Functions functions = new Functions(new UI());
        assertEquals(functions.getI(), 0);
    }

    @Test
    public void increasingPointsForGame1() {
        Functions functions = new Functions(new UI());
        functions.increasePoints(1);
        assertEquals(functions.toString(), "0 -1 1.0 0.0 0 0");
    }

    @Test
    public void increasingPointsForGame2() {
        Functions functions = new Functions(new UI());
        functions.increasePoints(2);
        assertEquals(functions.toString(), "0 -1 0.0 1.0 0 0");
    }

    @Test
    public void getPointsOfGame1() {
        Functions functions = new Functions(new UI());
        functions.increasePoints(1);
        functions.increasePoints(1);
        assertEquals(functions.getPoints(1), 2);
    }

    @Test
    public void getPointsOfGame2() {
        Functions functions = new Functions(new UI());
        functions.increasePoints(2);
        functions.increasePoints(2);
        assertEquals(functions.getPoints(2), 2);
    }

    @Test
    public void addAndGetNumberOfTimesPlayedQ1() {
        Functions functions = new Functions(new UI());
        functions.addNoOfTimesPlayed(1);
        functions.addNoOfTimesPlayed(1);
        assertEquals(functions.noOfTimesPlayed(1), 2);
    }

    @Test
    public void addAndGetNumberOfTimesPlayedQ2() {
        Functions functions = new Functions(new UI());
        functions.addNoOfTimesPlayed(2);
        functions.addNoOfTimesPlayed(2);
        assertEquals(functions.noOfTimesPlayed(2), 2);
    }

    @Test
    public void averageOfQuiz1() {
        Functions functions = new Functions(new UI());
        functions.addPoints(1);
        functions.addPoints(1);
        functions.addPoints(1);
        functions.addNoOfTimesPlayed(1);
        functions.addPoints(1);
        functions.addNoOfTimesPlayed(1);
        assertEquals(functions.countAverage(1), 1.5, 8.8);
    }

    @Test
    public void averageOfQuiz2() {
        Functions functions = new Functions(new UI());
        functions.addPoints(2);
        functions.addPoints(2);
        functions.addPoints(2);
        functions.addNoOfTimesPlayed(2);
        functions.addPoints(2);
        functions.addPoints(2);
        functions.addNoOfTimesPlayed(2);
        assertEquals(functions.countAverage(2), 2.5, 8.8);
    }

}
