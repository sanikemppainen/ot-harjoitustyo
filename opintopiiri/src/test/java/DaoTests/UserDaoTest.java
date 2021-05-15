/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoTests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import opintopiiri.dao.UserDao;
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
public class UserDaoTest {

    /*@AfterClass
    public static void connection(){
        Connection conn= null;
        Statement statement;
        try{
            conn=DriverManager.getConnection("jdbc:h2:./userdao", "sa", "");
        }catch(SQLException e){
            System.out.println("Failed to test "+e.getLocalizedMessage());
        }finally{
            try{
                if(conn!=null){
                    conn.close();
                }
            }catch(SQLException e){
                System.out.println("Failed to test "+e.ge);
            }
        }
    }*/
    @Test
    public void addUserCorrectly() throws SQLException {
        UserDao userdao = new UserDao(new User("nimi", "salasana"));
        assertEquals(userdao.toString(), "Nimi: nimi, Salasana: salasana");
    }

    @Test
    public void checkIfUserFound() throws SQLException {
        UserDao userdao = new UserDao(new User("nimi", "salasana"));
        assertEquals(userdao.checkIfUserExists("nimi"), true);
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

    @Test
    public void checkIfLoginDetailsCorrectTrue() throws SQLException {
        UserDao userdao = new UserDao(new User("nimi", "salasana"));
        assertEquals(userdao.checkIfUsernameMatchesPassword("nimi", "salasana"), true);
    }
}
