package opintopiiri.domain;

import java.util.ArrayList;
import opintopiiri.ui.UI;
import opintopiiri.dao.Quiz1;
import opintopiiri.dao.Quiz2;

/**
 * Class Functions is in charge of user logic
**/
public class Functions {

    UI ui;
    double points;
    double points2;
    private ArrayList<Double> list;
    private ArrayList<Double> q2list;
    Quiz1 quiz1;
    Quiz2 quiz2;
    int index;
    int indexA;
    int q1no;
    int q2no;

    /**
     *functions constructor
     * @param ui
     */
    public Functions(UI ui) {
        this.ui = ui;
        this.points = 0;
        this.points2=0;
        this.list = new ArrayList<>();
        this.index = 0;
        this.indexA = -1;
        this.quiz1 = new Quiz1();
        this.quiz2= new Quiz2();
        this.q1no = 0;
        this.q2no = 0;
        this.q2list = new ArrayList<>();
        
    }

    /**
     *Gets questions by that index from memory
     * @param quizNo indicates whether quiz 1 or quiz 2 is played
     * @return String with the wanted question
     */
    public String getQ(int quizNo) {
        index++;
        if (index < 8) {
            if(quizNo==1){
                return this.quiz1.getQ(index);
            }
            if(quizNo==2){
                return this.quiz2.getQ(index);
            }
        }
        return null;
    }

    /**
     *Gets the wanted answer by index
     * @param quizNo indicates whether quiz 1 or quiz 2 is played
     * @return String with the wanted question
     */
    public String getA(int quizNo) {
        indexA++;
        if (indexA < 8) {
            if (quizNo==1){
                return this.quiz1.getA(indexA);
            }if(quizNo==2){
                return this.quiz2.getA(indexA);
            }
        }
        return null;
    }

    /**
     *Checks if there are questions left to ask
     * @return true or false value whether there are more questions left
     */
    public boolean checkIfMoreQs() {
        if (index < 8) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *Resets variables in order to play the dame again
     */
    public void indexToZero() {
        this.index = 0;
        this.indexA = -1;
        //this.list.removeAll(list);
        this.points = 0;
        this.points2=0;
    }


    /**
     *returns the current index
     * @return index
     */
    public int getI() {
        return index;
    }

    /**
     *Increases points
     * @param quizNo indicates whether quiz 1 or quiz 2 is played
     */
    public void increasePoints(int quizNo) {
        if(quizNo==1){
            this.points++;
        }if(quizNo==2){
            this.points2++;
        }
    }

    /**
     *returns how many points have been earned
     * @param quizNo indicates whether quiz 1 or quiz 2 is played
     * @return number of points for that game
     */
    public int getPoints(int quizNo) {
        //System.out.println("return points"+this.points);
        if(quizNo==1){
            int pal = (int) this.points;        
            return pal;
        }if(quizNo==2){
            int pal= (int) this.points2;
            return pal;
        }
        return 0;
    }

    /**
     *Adds earned points to a list
     * @param quizNo indicates whether quiz 1 or quiz 2 is played
     */
    public void addPoints(int quizNo) {
        if (quizNo == 1) {
            list.add(this.points);
        }
        if (quizNo == 2) {
            q2list.add(this.points2);
        }

    }

    /**
     *Increases how many times a game has been played
     * @param quizNo indicates whether quiz 1 or quiz 2 is played
     */
    public void addNoOfTimesPlayed(int quizNo) {
        if (quizNo == 1) {
            q1no++;
        }
        if (quizNo == 2) {
            q2no++;
        }
    }

    /**
     *returns how many times a game has been played
     * @param quizNo indicates whether quiz 1 or quiz 2 is played
     * @return number of times played by game
     */
    public int noOfTimesPlayed(int quizNo) {
        if (quizNo == 1) {
            return q1no;
        }
        if (quizNo == 2) {
            return q2no;
        }
        return 0;
    }

    /**
     *Counts average points of that game
     * @param quizNo indicates whether quiz 1 or quiz 2 is played
     * @return average for that game 
     */
    public double countAverage(int quizNo) {
        if (quizNo == 1) {
            double returnable = 0;
            double total = 0;
            for (int i = 0; i < this.list.size(); i++) {
                total += list.get(i);
                returnable = total / list.size();
            }
            return returnable;
        }
        if (quizNo == 2) {
            double returnable = 0;
            double total = 0;
            for (int i = 0; i < this.q2list.size(); i++) {
                total += q2list.get(i);
                returnable = total / q2list.size();
            }
            return returnable;
        }
        return 8.8;
    }

    /**
     *Returns the string
     * @return
     */
    public String toString() {
        return this.index+" "+this.indexA+" "+this.points+" "+this.points2+" "+this.q1no+" "+this.q2no;
    }
}
