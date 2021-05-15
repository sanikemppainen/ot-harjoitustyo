package opintopiiri.dao;

import java.util.ArrayList;

/**
 * Builds the quiz 2: dinosaurs
 *
 * @author ksani
 */
public class Quiz2 {

    ArrayList<String> qlist2 = new ArrayList<>();
    ArrayList<String> alist2 = new ArrayList<>();

    /**
     * Constructor adds q and a to lists
     */
    public Quiz2() {
        qlist2.add("On which continent have the most dinosaur fossils been found?        " + "\n" + "a:Europe " + "\n" + "b:North America " + "\n" + "c:Africa " + "\n" + "d: Asia");
        qlist2.add("Which of these creatures existed at the same time as dinosaurs?      " + "\n" + "a:Neanderthalis humans " + "\n" + "b:Woolly mammoths" + "\n" + "c:Saber-toothed cats" + "\n" + "d:None of these");
        qlist2.add("When dinosaur bones were first discovered 2000 years ago in China,   " + "\n" + "what did the Chinese think they were?" + "\n" + "a:Large chicken bones " + "\n" + "b:Dragon bones" + "\n" + "c:Panda bones" + "\n" + "d: Fossilized tree trunks");
        qlist2.add("When did dinosaurs go extinct?                                       " + "\n" + "a: 65 million years ago " + "\n" + "b: 300 million years ago" + "\n" + "c:35 million years ago" + "\n" + "d:2021 years ago");
        qlist2.add("How tall could a Tyrannosaurus Rex grow?                             " + "\n" + "a:10 meters" + "\n" + "b:3,5 meters " + "\n" + "c:6,1 meters" + "\n" + "d: 12,4 meters");
        qlist2.add("What is most likely to have caused the extinction of the dinosaurs?  " + "\n" + "a:God" + "\n" + "b:Excess hunting " + "\n" + "c: An asteroid" + "\n" + "d:Covid-19");
        qlist2.add("How many years did dinasaurs rule the earth?                         " + "\n" + "a:160 million" + "\n" + "b: 65 million" + "\n" + "c:8 million " + "\n" + "d:200 million");
        qlist2.add("How long are the arms of an average T-Rex?                           " + "\n" + "a:3 meters " + "\n" + "b:2 meters" + "\n" + "c:1 meter" + "\n" + "d: 1/2 meters");

        alist2.add("b");
        alist2.add("d");
        alist2.add("b");
        alist2.add("a");
        alist2.add("c");
        alist2.add("c");
        alist2.add("a");
        alist2.add("d");
    }

    //PARAMETREIKSI MITKÄLISTAT HALUAA, INT MIKÄ LISTA 1 2 VAI 3
    /**
     * returns a question based on index
     *
     * @param index refers to in which index the question is in
     * @return
     */
    public String getQ(int index) {
        return this.qlist2.get(index);

    }

    /**
     * returns an answer based on index
     *
     * @param index refers to in which index the question is in
     * @return
     */
    public String getA(int index) {
        return alist2.get(index);
    }

    /**
     * return length of question list
     *
     * @return length of list
     */
    public int getLength() {
        return this.qlist2.size();
    }

}
