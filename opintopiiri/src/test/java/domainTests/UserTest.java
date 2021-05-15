/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domainTests;

import opintopiiri.domain.User;
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
public class UserTest {

    @Test
    public void testNameAndPassword() {
        User user = new User("nimi2", "salasana");
        assertEquals("nimi2 salasana", user.toString());

    }

    @Test
    public void testGetUsername() {
        User user = new User("nimi2", "salasana");
        assertEquals(user.getUsername(), "nimi2");
    }

    @Test
    public void testSetUsername() {
        User user = new User("nimi2", "salasana");
        user.setUsername("nimi");
        assertEquals(user.toString(), "nimi salasana");
    }

    @Test
    public void testGetPassword() {
        User user = new User("nimi2", "salasana");
        assertEquals(user.getPassword(), "salasana");
    }

    @Test
    public void testSetPassword() {
        User user = new User("nimi2", "salasana");
        user.setPassword("sala");
        assertEquals(user.toString(), "nimi2 sala");
    }
}
