package opintopiiri.domain;

import java.util.ArrayList;
import opintopiiri.ui.UI;
import opintopiiri.dao.Quiz2;

public class Functions {

    UI ui;
    double points;
    private ArrayList<Double> list;
    private ArrayList<Double> q2list;
    Quiz2 quiz2;
    int index;
    int indexA;
    int q1no;
    int q2no;

    public Functions(UI ui) {
        this.ui = ui;
        this.points = 0;
        this.list = new ArrayList<>();
        this.index = 0;
        this.indexA = -1;
        this.quiz2 = new Quiz2();
        this.q1no = 0;
        this.q2no = 0;
        this.q2list = new ArrayList<>();
    }
    ////////
    //LAITA TOIMIMAAN MUILLEKIN QUIZZES ELIKKÄ PARAMETRIIN MYÖS MIKÄ LISTA JOS KAIKKI LISTAT SAMASSA? VAI ERI LUOKISSA? ERI METODIT ERI LUOKILLE? PARAMETRINA LUOKKA JA IF EHDOT MIHIN LUOKKAAN KYSYTÄÄN

    public boolean checkIfAIsCorrect(int i) {
        return true;
    }

    public String getQ() {
        index++;
        if (index < 8) {
            return this.quiz2.getQ(index);

        }
        return null;
    }

    public String getA() {
        indexA++;
        if (indexA < 8) {
            return this.quiz2.getA(indexA);

        }
        return null;
    }

    public boolean checkIfMoreQs() {
        if (index < 8) {
            return true;
        } else {
            return false;
        }
    }

    public void indexToZero() {
        this.index = 0;
        this.indexA = -1;
        this.list.removeAll(list);
        this.points = 0;
    }

    ////////
    public int getI() {
        return index;
    }

    public void increasePoints() {
        this.points++;
        this.list.add(points);
        //System.out.println("lisatty pisteet functions metodissa");
        //System.out.println("pisteet: " + this.points);

    }

    public int getPoints() {
        //System.out.println("return points"+this.points);
        int pal = (int) this.points;
        return pal;
    }

    //lisää monta pistettä sai yhdestä pelistä pelin loputtua
    public void addPoints(int no) {
        if (no == 1) {
            //System.out.println("lisätty listalle 1 pisteet");
            list.add(this.points);
        }
        if (no == 2) {
            q2list.add(this.points);
        }

    }

    public void addNoOfTimesPlayed(int no) {
        if (no == 1) {
            q1no++;
        }
        if (no == 2) {
            q2no++;
        }
    }

    public int noOfTimesPlayed(int no) {
        if (no == 1) {
            return q1no;
        }
        if (no == 2) {
            return q2no;
        }
        return 0;
    }

    public double countAverage(int no) {
        if (no == 1) {
            double returnable = 0;
            double total = 0;
            for (int i = 0; i < this.list.size(); i++) {
                total += list.get(i);
                returnable = total / list.size();
            }
            //System.out.println("laske average 1:" + returnable);
            return returnable;
        }
        if (no == 2) {
            Double returnable = q2list.stream()
                    .mapToDouble(i -> i)
                    .average().orElse(0.0);
            return returnable;

        }

        return 0.0;
    }

    public String toString() {
        return "I: " + this.index + ", Points: " + this.points + ", IA: " + this.indexA + ", q1no: " + this.q1no;
    }
}
