/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
    public void testLengthOfQuiz1(){
        Quiz1 quiz1 = new Quiz1();
        assertEquals(quiz1.getLength(), 8);
    }
    @Test
    public void testLengthOfQuiz2(){
        Quiz2 quiz2 = new Quiz2();
        assertEquals(quiz2.getLength(), 8);
    }
   
}
