/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoTests;

import java.sql.SQLException;
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
    @Test
    public void addUserCorrectly() throws SQLException{
        UserDao userdao= new UserDao(new User("nimi", "salasana"));
        userdao.addUser(new User("nimi","salasana"));
        assertEquals(userdao.toString(),"Nimi: nimi, Salasana: salasana");
    }
    @Test
    public void checkIfUserFound() throws SQLException{
        UserDao userdao= new UserDao(new User("nimi", "salasana"));
        userdao.addUser(new User("nimi","salasana"));
        assertEquals(userdao.checkIfUserExists("nimi"), true);
    }
    @Test
    public void checkIfUserFoundFalse() throws SQLException{
        UserDao userdao= new UserDao(new User("nimi", "salasana"));
        userdao.addUser(new User("nimi","salasana"));
        assertEquals(userdao.checkIfUserExists("erinimi"), false);
    }
   
}
