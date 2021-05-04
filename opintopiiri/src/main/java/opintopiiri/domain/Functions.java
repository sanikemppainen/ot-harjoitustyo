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
    ////////
    //LAITA TOIMIMAAN MUILLEKIN QUIZZES ELIKKÄ PARAMETRIIN MYÖS MIKÄ LISTA JOS KAIKKI LISTAT SAMASSA? VAI ERI LUOKISSA? ERI METODIT ERI LUOKILLE? PARAMETRINA LUOKKA JA IF EHDOT MIHIN LUOKKAAN KYSYTÄÄN

    /**
     * checks if the answer is correct
     * @param i
     * @return
     */
    public boolean checkIfAIsCorrect(int i) {
        return true;
    }
    

    /**
     *Gets questions by that index from memory
     * @return
     */
    public String getQ(int q) {
        index++;
        if (index < 8) {
            if(q==1){
                return this.quiz1.getQ(index);
            }
            if(q==2){
                return this.quiz2.getQ(index);
            }
        }
        return null;
    }

    /**
     *Gets the wanted answer by index
     * @return
     */
    public String getA(int q) {
        indexA++;
        if (indexA < 8) {
            if (q==1){
                return this.quiz1.getA(indexA);
            }if(q==2){
                return this.quiz2.getA(indexA);
            }
        }
        return null;
    }

    /**
     *Checks if there are questions left to ask
     * @return
     */
    public boolean checkIfMoreQs() {
        if (index < 8) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *Returns the index to zero in order to play the dame again
     */
    public void indexToZero() {
        this.index = 0;
        this.indexA = -1;
        this.list.removeAll(list);
        this.points = 0;
        this.points2=0;
    }

    ////////

    /**
     *returns the current index
     * @return
     */
    public int getI() {
        return index;
    }

    /**
     *Increases points
     */
    public void increasePoints(int q) {
        if(q==1){
            this.points++;
        }if(q==2){
            this.points2++;
        }
        //this.list.add(points);
        //System.out.println("lisatty pisteet functions metodissa");
        //System.out.println("pisteet: " + this.points);

    }

    /**
     *returns how many points there are
     * @return
     */
    public int getPoints(int q) {
        //System.out.println("return points"+this.points);
        if(q==1){
            int pal = (int) this.points;        
            return pal;
        }if(q==2){
            int pal= (int) this.points2;
            return pal;
        }
        return 0;
    }

    //lisää monta pistettä sai yhdestä pelistä pelin loputtua

    /**
     *Adds earned points to a list 
     * @param no
     */
    public void addPoints(int no) {
        if (no == 1) {
            //System.out.println("lisätty listalle 1 pisteet");
            list.add(this.points);
            //System.out.println("listalle 1 pisteet lisätty: "+this.points);
            //System.out.println(list.size());
            
        }
        if (no == 2) {
            q2list.add(this.points2);
        }

    }

    /**
     *Increases how many times a game has been played
     * @param no
     */
    public void addNoOfTimesPlayed(int no) {
        if (no == 1) {
            q1no++;
        }
        if (no == 2) {
            q2no++;
        }
        
    }

    /**
     *returns how many times a game has been played
     * @param no
     * @return
     */
    public int noOfTimesPlayed(int no) {
        if (no == 1) {
            return q1no;
        }
        if (no == 2) {
            return q2no;
        }
        return 0;
    }

    /**
     *Counts average points of that game
     * @param no
     * @return
     */
    public double countAverage(int no) {
        if (no == 1) {
            System.out.println(this.list.size());
            
            double returnable = 0;
            double total = 0;
            for (int i = 0; i < this.list.size(); i++) {
                total += list.get(i);
                System.out.println(list.get(i));
                returnable = total / list.size();
            }
            System.out.println("laske average 1:" + returnable);
            return returnable;
        }
        /*if (no == 2) {
            Double returnable = q2list.stream()
                    .mapToDouble(i -> i)
                    .average().orElse(0.0);
            return returnable;

        }*/

        return 0.0;
    }

    /**
     *Returns the string
     * @return
     */
    public String toString() {
        return "I: " + this.index + ", Points: " + this.points + ", IA: " + this.indexA + ", q1no: " + this.q1no + ", q2no: "+this.q2no;
    }
}
