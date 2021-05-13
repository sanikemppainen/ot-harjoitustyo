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
    private int q1noplayed = 0;
    private double q1average = 0;
    private int q2noplayed = 0;
    private double q2average = 0;

    /**
     *constructor
     * @param username
     * @param password
     * @param q1noplayed
     * @param q1average
     * @param q2noplayed
     * @param q2average
     */
    public User(String username, String password, int q1noplayed, double q1average, int q2noplayed, double q2average) {
        this.username = username;
        this.password = password;
        this.q1noplayed = q1noplayed;
        this.q1average = q1average;
        this.q2noplayed = q2noplayed;
        this.q2average = q2average;
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
    public int getQ1noplayed() {
        return q1noplayed;
    }

    /**
     *
     * @param q1noplayed
     */
    public void setQ1noplayed(int q1noplayed) {
        this.q1noplayed = q1noplayed;
    }

    /**
     *
     * @return
     */
    public double getQ1average() {
        return q1average;
    }

    /**
     *
     * @return
     */
    public double calculateQ1average() {
        return 0.0;
    }

    /**
     *
     * @param q1average
     */
    public void setQ1average(double q1average) {
        this.q1average = q1average;
    }

    /**
     *
     * @return
     */
    public int getQ2noplayed() {
        return q2noplayed;
    }

    /**
     *
     * @param q2noplayed
     */
    public void setQ2noplayed(int q2noplayed) {
        this.q2noplayed = q2noplayed;
    }

    /**
     *
     * @return
     */
    public double getQ2average() {
        return q2average;
    }

    /**
     *
     * @param q2average
     */
    public void setQ2average(double q2average) {
        this.q2average = q2average;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "User (Username: " + username + ", Password: " + password + ", Number of times Quiz 1 has been played: " + q1noplayed + ", Average % of Quiz 1: " + q1average + ", Number of times Quiz 2 has been played: " + q2noplayed + ", Average % of Quiz 2: " + q2average + ")";
    }

}
