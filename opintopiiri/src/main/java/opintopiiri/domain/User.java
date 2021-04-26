//yksittäiset this.username=username
//hae tällä yksittäisellä userdaosta
package opintopiiri.domain;

import java.util.ArrayList;

public class User {

    private String username;
    private String password;
    private int q1noplayed = 0;
    private double q1average = 0;
    private int q2noplayed = 0;
    private double q2average = 0;

    public User(String username, String password, int q1noplayed, double q1average, int q2noplayed, double q2average) {
        this.username = username;
        this.password = password;
        this.q1noplayed = q1noplayed;
        this.q1average = q1average;
        this.q2noplayed = q2noplayed;
        this.q2average = q2average;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getQ1noplayed() {
        return q1noplayed;
    }

    public void setQ1noplayed(int q1noplayed) {
        this.q1noplayed = q1noplayed;
    }

    public double getQ1average() {
        return q1average;
    }

    public double calculateQ1average() {
        return 0.0;
    }

    public void setQ1average(double q1average) {
        this.q1average = q1average;
    }

    public int getQ2noplayed() {
        return q2noplayed;
    }

    public void setQ2noplayed(int q2noplayed) {
        this.q2noplayed = q2noplayed;
    }

    public double getQ2average() {
        return q2average;
    }

    public void setQ2average(double q2average) {
        this.q2average = q2average;
    }

    @Override
    public String toString() {
        return "User (Username: " + username + ", Password: " + password + ", Number of times Quiz 1 has been played: " + q1noplayed + ", Average % of Quiz 1: " + q1average + ", Number of times Quiz 2 has been played: " + q2noplayed + ", Average % of Quiz 2: " + q2average + ")";
    }

}
