/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
    public opintopiiriTest() {
       
    }
    
    @Before
    public void setUp() {
        user=new opintopiiri.domain.User("testinimi", "testisalasana",0,0,0,0);
        userdao=new opintopiiri.dao.UserDao(user);
    }
    @Test
    public void lisaaIhminenOikein(){
        String vastaus= userdao.toString();
        assertEquals("Nimi: testinimi, Salasana: testisalasana",vastaus);
        
    }

    
}
