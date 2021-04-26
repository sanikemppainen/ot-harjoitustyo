package opintopiiri.dao;

import java.util.ArrayList;

public class Quiz2 {

    ArrayList<String> qlist = new ArrayList<>();
    ArrayList<String> alist = new ArrayList<>();

    public Quiz2() {
        qlist.add("What kind of fish is Nemo in the movie 'Finding Nemo'?" + "\n" + "a:Tiger Shark " + "\n" + "b:Salmon " + "\n" + "c:Clownfish " + "\n" + "d: Goldfish");
        qlist.add("Are jellyfish a type of fish?                         " + "\n" + "a:Yes " + "\n" + "b:No" + "\n" + " " + "\n");
        qlist.add("What is a group of dolphins called?                   " + "\n" + "a:Hurricanes " + "\n" + "b:Nets " + "\n" + "c:Pods " + "\n" + "d: School");
        qlist.add("Can goldfish close their eyes?                        " + "\n" + "a: Yes but only when sleeping " + "\n" + "b:Yes, whenever they want " + "\n" + "c:Only in dirty water " + "\n" + "d:No, never");
        qlist.add("Can goldfish smell?                                   " + "\n" + "a:Yes " + "\n" + "b:No " + "\n" + " " + "\n");
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

    //PARAMETREIKSI MITKÄLISTAT HALUAA, INT MIKÄ LISTA 1 2 VAI 3
    public String getQ(int i) {
        return this.qlist.get(i);

    }

    public String getA(int i) {
        return alist.get(i);
    }

    public int getLength() {
        return this.qlist.size();
    }

    public void makeA() {

        /* map.put("Can a white shark control their body temprature?"+"\n"+"a:Yes b:No", "a");
        map.put("Are jellyfish a type of fish?"+"\n"+"a:Yes b:No", "a");
        map.put("What is a group of dolphins called?"+"\n"+"a:Hurricanes b:Nets c:Pods d: School", "c");
        map.put("Can goldfish close their eyes?"+"\n"+"a: Yes but only when sleeping b:Yes, whenever they want c:Only in dirty water d:No, never", "d");
        map.put("Can goldfish smell?"+"\n"+"a:Yes b:No ", "a");
        map.put("What is the fastest fish?"+"\n"+"a:Swordfish b:Racing Shark c: Sail Fish d: Trout", "c");
        map.put("What is the largest species of fish?"+"\n"+"a:Tuna b:Whale Shark c:Tiger Shark d:Blue Whale", "b");
        map.put("How many different fish species are there worldwide?"+"\n"+"a:9000 b:34 000 c:120 000 d: 24 000 000", "b");
         */
    }

}
