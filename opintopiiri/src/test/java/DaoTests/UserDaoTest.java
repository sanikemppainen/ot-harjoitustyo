/*
 * Tests for dao files
 */
package DaoTests;

import java.sql.SQLException;
import opintopiiri.dao.UserDao;
import opintopiiri.domain.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author ksani
 */
public class UserDaoTest {

    @Test
    public void addUserCorrectly() throws SQLException {
        UserDao userdao = new UserDao(new User("nimi", "salasana"));
        assertEquals(userdao.toString(), "Nimi: nimi, Salasana: salasana");
    }

    @Test
    public void checkIfUserFoundFalse() throws SQLException {
        UserDao userdao = new UserDao(new User("nimi", "salasana"));
        assertEquals(userdao.checkIfUserExists("erinimi"), false);
    }

    @Test
    public void checkIfLoginDetailsCorrectFalse() throws SQLException {
        UserDao userdao = new UserDao(new User("nimi", "salasana"));
        assertEquals(userdao.checkIfUsernameMatchesPassword("nimitoinen", "password"), false);
    }
}
