package opintopiiri.dao;

import java.util.ArrayList;

/**
 *Builds the quiz 1: fishes
 * @author ksani
 */
public class Quiz1 {

    ArrayList<String> qlist = new ArrayList<>();
    ArrayList<String> alist = new ArrayList<>();

    /**
     *Constructor adds questions and answers to lists
     */
    public Quiz1() {
        qlist.add("What kind of fish is Nemo in the movie 'Finding Nemo'?" + "\n" + "a:Tiger Shark " + "\n" + "b:Salmon " + "\n" + "c:Clownfish " + "\n" + "d: Goldfish");
        qlist.add("Are jellyfish a type of fish?                         " + "\n" + "a:Yes " + "\n" + "b:No" + "\n" + "c:Saltwater jellyfishes are " + "\n"+"d: Freshwater jellyfishes are");
        qlist.add("What is a group of dolphins called?                   " + "\n" + "a:Hurricanes " + "\n" + "b:Nets " + "\n" + "c:Pods " + "\n" + "d: School");
        qlist.add("Can goldfish close their eyes?                        " + "\n" + "a: Yes but only when sleeping " + "\n" + "b:Yes, whenever they want " + "\n" + "c:Only in dirty water " + "\n" + "d:No, never");
        qlist.add("Can goldfish smell?                                   " + "\n" + "a:Yes " + "\n" + "b:No " + "\n" + "c:The females can " + "\n"+"d: The males can");
        qlist.add("What is the fastest fish?                             " + "\n" + "a:Swordfish " + "\n" + "b:Racing Shark " + "\n" + "c: Sail Fish " + "\n" + "d: Trout");
        qlist.add("What is the largest species of fish?                  " + "\n" + "a:Tuna " + "\n" + "b:Whale Shark " + "\n" + "c:Tiger Shark " + "\n" + "d:Blue Whale");
        qlist.add("How many different fish species are there worldwide?  " + "\n" + "a:9000 " + "\n" + "b:34 000 " + "\n" + "c:120 000 " + "\n" + "d: 24 000 000");

        alist.add("c");
        alist.add("a");
        alist.add("c");
        alist.add("d");
        alist.add("a");
        alist.add("c");
        alist.add("b");
        alist.add("b");
    }

    /**
     *returns a question based on index
     * 
     * @param index refers to the index in which the question is in
     * @return
     */ 
    public String getQ(int index) {
        return this.qlist.get(index);

    }

    /**
     *returns an answer based on index
     * @param index refers to the index in which the answer is in
     * @return
     */
    public String getA(int index) {
        return alist.get(index);
    }

    /**
     *return length of question list
     * @return list's length
     */
    public int getLength() {
        return this.qlist.size();
    }

    

}
