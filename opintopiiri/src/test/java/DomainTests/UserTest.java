/*
 * Tests for user class
 */
package DomainTests;

import opintopiiri.domain.User;
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
