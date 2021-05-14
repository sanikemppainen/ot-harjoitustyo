//yksittäiset this.username=username
//hae tällä yksittäisellä userdaosta
package opintopiiri.domain;

/**
 *Information on one user
 * @author ksani
 */
public class User {
    
    private String username;
    private String password;

    /**
     *constructor
     * @param username
     * @param password
     */
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return this.username+" "+this.password;
    }

}
