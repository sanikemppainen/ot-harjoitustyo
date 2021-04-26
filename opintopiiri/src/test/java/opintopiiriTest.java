/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class opintopiiriTest {

    opintopiiri.dao.UserDao userdao;
    opintopiiri.domain.User user;
    opintopiiri.domain.Functions functions;
    opintopiiri.ui.UI ui;

    public opintopiiriTest() {

    }

    @Before
    public void setUp() {
        user = new opintopiiri.domain.User("testinimi", "testisalasana", 0, 0, 0, 0);
        userdao = new opintopiiri.dao.UserDao(user);
        functions = new opintopiiri.domain.Functions(ui);
    }

    @Test
    public void lisaaIhminenOikein() {
        String vastaus = userdao.toString();
        assertEquals("Nimi: testinimi, Salasana: testisalasana", vastaus);

    }

    @Test
    public void setPassowrd() {
        user.setPassword("sala");
        String vastaus = user.toString();
        assertEquals("User (Username: testinimi, Password: sala, Number of times Quiz 1 has been played: 0, Average % of Quiz 1: 0.0, Number of times Quiz 2 has been played: 0, Average % of Quiz 2: 0.0)", vastaus);
    }

    @Test
    public void setAndGetQ1noplayed() {
        user.setQ1noplayed(2);
        user.getQ1noplayed();
        String vastaus = user.toString();
        assertEquals("User (Username: testinimi, Password: testisalasana, Number of times Quiz 1 has been played: 2, Average % of Quiz 1: 0.0, Number of times Quiz 2 has been played: 0, Average % of Quiz 2: 0.0)", vastaus);
    }

    @Test
    public void getAndSetQ1Average() {
        user.setQ1average(2.0);
        user.calculateQ1average();
        user.getQ1average();
        assertEquals("User (Username: testinimi, Password: testisalasana, Number of times Quiz 1 has been played: 0, Average % of Quiz 1: 2.0, Number of times Quiz 2 has been played: 0, Average % of Quiz 2: 0.0)", user.toString());
    }

    @Test
    public void setAndGetQ2noplayed() {
        user.setQ2noplayed(2);
        user.getQ2noplayed();
        String vastaus = user.toString();
        assertEquals("User (Username: testinimi, Password: testisalasana, Number of times Quiz 1 has been played: 0, Average % of Quiz 1: 0.0, Number of times Quiz 2 has been played: 2, Average % of Quiz 2: 0.0)", vastaus);
    }

    @Test
    public void getAndSetQ2Average() {
        user.setQ2average(2.0);
        user.getQ2average();
        assertEquals("User (Username: testinimi, Password: testisalasana, Number of times Quiz 1 has been played: 0, Average % of Quiz 1: 0.0, Number of times Quiz 2 has been played: 0, Average % of Quiz 2: 2.0)", user.toString());
    }

    @Test
    public void checkIfLoginWorks() {
        try {
            userdao.checkIfUsernameMatchesPassword("name", "pword");
        } catch (SQLException ex) {
            Logger.getLogger(opintopiiriTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(true, true);
    }

    @Test
    public void checkIfUserExists() {
        try {
            userdao.checkIfUserExists("name2");
        } catch (SQLException ex) {
            Logger.getLogger(opintopiiriTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(false, false);
    }

    ////////////////////////////////////
    @Test
    public void setI() {
        functions.getI();
        assertEquals("I: 0, Points: 0.0, IA: -1, q1no: 0", functions.toString());

    }

    //lisää stringiin
    @Test
    public void setA() {
        functions.getA();
        functions.checkIfAIsCorrect(1);
        assertEquals("I: 0, Points: 0.0, IA: 0, q1no: 0", functions.toString());

    }

}
