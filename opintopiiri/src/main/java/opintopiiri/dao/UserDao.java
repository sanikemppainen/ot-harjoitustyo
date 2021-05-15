package opintopiiri.dao;

import opintopiiri.domain.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Builds, adds to, updates and pulls data from database
 *
 * @author ksani
 */
public class UserDao {

    User user;

    /**
     * constructor
     *
     * @param user indicates which user's data from the database is modified
     */
    public UserDao(User user) {
        this.user = user;

    }

    /**
     * Adds user to the database
     *
     * @param user is the given user
     * @throws SQLException if user is not added correctly
     */
    public void addUser(User user) throws SQLException {
        try ( Connection connection = createConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO USERDAO (username, password, q1noplayed, q1average, q2noplayed, q2average) VALUES (?,?,0,0,0,0)");
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("SQL Exception in adding a user");
        }
    }

    /**
     * checks if user exists
     *
     * @param username is the given username by which data is checked
     * @return boolea value of found: true, if not: false
     * @throws SQLException if cannot check if user exists
     */
    public boolean checkIfUserExists(String username) throws SQLException {
        try ( Connection connection = createConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT username FROM USERDAO WHERE username = ?");
            statement.setString(1, username);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception in checking if user exists");
        }
        return false;

    }

    /**
     * checks if login data is correct from database
     *
     * @param username given username
     * @param password given password
     * @return boolea value of true or false
     * @throws SQLException if cannot check whether the user exists
     */
    public boolean checkIfUsernameMatchesPassword(String username, String password) throws SQLException {
        try ( Connection connection = createConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT username FROM USERDAO WHERE username = ? AND password = ?");
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception in checking if user exists");
        }
        return false;
    }

    /**
     * create a connection to database
     *
     * @return connection
     * @throws SQLException
     */
    public Connection createConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:./userdao", "sa", "");
        conn.prepareStatement("CREATE TABLE IF NOT EXISTS USERDAO (username char primary key, password char, q1noplayed int, q1average double, q2noplayed int, q2average double)").execute();

        return conn;
    }

    /**
     * returns string to class
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nimi: " + this.user.getUsername() + ", Salasana: " + this.user.getPassword();
    }

}
