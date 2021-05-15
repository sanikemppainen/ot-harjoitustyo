package opintopiiri.domain;

/**
 * Information on one user
 *
 * @author ksani
 */
public class User {

    private String username;
    private String password;

    /**
     * constructor
     *
     * @param username
     * @param password
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * get username
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * set username
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * get password
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * String
     *
     * @return
     */
    @Override
    public String toString() {
        return this.username + " " + this.password;
    }

}
