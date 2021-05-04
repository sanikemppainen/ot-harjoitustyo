package opintopiiri.dao;

import opintopiiri.domain.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *Code to add, update and build from database
 * @author ksani
 */
public class UserDao {

    User user;

    /**
     *constructor
     * @param user
     */
    public UserDao(User user) {
        this.user = user;

    }

    /**
     *Adds user to database
     * @param user
     * @throws SQLException
     */
    public void addUser(User user) throws SQLException {
        try (Connection connection = createConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO USERDAO (username, password, q1noplayed, q1average, q2noplayed, q2average) VALUES (?,?,0,0,0,0)");
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            /*statement.setInt(3, user.getQ1noplayed());
            statement.setDouble(4, user.getQ1average());
            statement.setInt(5, user.getQ2noplayed());
            statement.setDouble(6, user.getQ2average());*/
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("SQL Exception in adding a user");
        }
    }

    /**
     *checks if user exists
     * @param username
     * @return
     * @throws SQLException
     */
    public boolean checkIfUserExists(String username) throws SQLException {
        try (Connection connection = createConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT username FROM USERDAO WHERE username = ?");
            statement.setString(1, username);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                //dbssä on jo sen niminen
                return true;
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception in checking if user exists");
        }
        return false;

    }

    /**
     *checks if login info is correct from database
     * @param username
     * @param password
     * @return
     * @throws SQLException
     */
    public boolean checkIfUsernameMatchesPassword(String username, String password) throws SQLException {
        try (Connection connection = createConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT username FROM USERDAO WHERE username = ? AND password = ?");
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                //dbssä on matchaavat username ja password
                return true;
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception in checking if user exists");
        }
        return false;
    }

    /**
     *increases number of times 1 game has been played
     * @param username
     * @throws SQLException
     */
    public void increaseQ1NoPlayed(String username) throws SQLException {
        try (Connection connection = createConnection()) {
            PreparedStatement statement = connection.prepareStatement("UPDATE USERDAO SET q1noplayed = q1noplayed + 1 WHERE username = ? ");
            statement.setString(1, username);
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("SQL Exception in updating Q1 numnber of times played");
        }
    }

    /**
     *increases number of times 2 game has been played
     * @param username
     * @throws SQLException
     */
    public void increaseQ2NoPlayed(String username) throws SQLException {
        try (Connection connection = createConnection()) {
            PreparedStatement statement = connection.prepareStatement("UPDATE USERDAO SET q2noplayed = q2noplayed + 1 WHERE username = ? ");
            statement.setString(1, username);
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("SQL Exception in updating Q2 number of times played");
        }
    }

    /**
     *updates game 1 average
     * @param average
     * @param username
     * @throws SQLException
     */
    public void updateQ1average(Double average, String username) throws SQLException {
        try (Connection connection = createConnection()) {
            PreparedStatement statement = connection.prepareStatement("UPDATE USERDAO SET q1average = ? WHERE username = ? ");
            statement.setDouble(1, average);
            statement.setString(2, username);
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("SQL Exception in ");
        }
    }

    /**
     *updates game 2 average
     * @param username
     * @throws SQLException
     */
    public void updateQ2average(String username) throws SQLException {
        try (Connection connection = createConnection()) {
            PreparedStatement statement = connection.prepareStatement("UPDATE USERDAO SET q1average = ? WHERE username = ? ");
            statement.setString(1, username);
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("SQL Exception in ");
        }
    }

    /**
     *resets database
     */
    public void resetH2() {
        try (Connection connection = createConnection()) {
            PreparedStatement statement = connection.prepareStatement("TRUNCATE TABLE USERDAO");
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("SQL Exception in resetting table");
        }
    }

    /**
     *creates conncetion to database
     * @return
     * @throws SQLException
     */
    public Connection createConnection() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:h2:./userdao", "sa", "");

        try {
            //System.out.println("Yhteys luotu");
            conn.prepareStatement("SELECT * FROM USERDAO");
            //conn.prepareStatement("CREATE TABLE USERDAO (username char primary key, password char, q1noplayed int, q1average double, q2noplayed int, q2average double)").execute();
        } catch (SQLException e) {
            System.out.println("SQL Exception in creating table");
        }

        return conn;
    }

    /**
     *returns string to class
     * @return
     */
    @Override
    public String toString() {
        return "Nimi: " + this.user.getUsername() + ", Salasana: " + this.user.getPassword();
    }

}
