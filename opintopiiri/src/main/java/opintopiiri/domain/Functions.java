
package opintopiiri.domain;

import java.util.ArrayList;
import opintopiiri.ui.UI;
import opintopiiri.dao.Quiz2;

public class Functions {
    UI ui;
    double points;
    private ArrayList<Double> list;
    private ArrayList<Double> q2list;
    private ArrayList<Double> q3list;
    Quiz2 quiz2;
    int index;
    int indexA;
    int q1no;
    int q2no;
    int q3no;
    

    
    public Functions(UI ui){
        this.ui=ui;
        this.points=0;
        this.list=new ArrayList<>();
        this.index=0;
        this.indexA=-1;
        this.quiz2= new Quiz2();
        this.q1no=0;
        this.q2no=0;
        this.q3no=0;
        this.q2list= new ArrayList<>();
        this.q3list= new ArrayList<>();
    }
    ////////
    //LAITA TOIMIMAAN MUILLEKIN QUIZZES ELIKKÄ PARAMETRIIN MYÖS MIKÄ LISTA JOS KAIKKI LISTAT SAMASSA? VAI ERI LUOKISSA? ERI METODIT ERI LUOKILLE? PARAMETRINA LUOKKA JA IF EHDOT MIHIN LUOKKAAN KYSYTÄÄN
    
    public boolean checkIfAIsCorrect(int i){
        return true;
    }
    public String getQ(){
        index++;
        if(index<8){
            return this.quiz2.getQ(index);

        }return null;
    }
    public String getA(){
        indexA++;
        if(indexA<8){
            return this.quiz2.getA(indexA);

        }
        return null;
    }
    public boolean checkIfMoreQs(){
        if(index<8){
            return true;
        }else{
            return false;
        }
    }
    public void indexToZero(){
        this.index=0;
        this.indexA=-1;
        this.list.removeAll(list);
        this.points=0;
    }
    
    ////////
    public int getI(){
        return index;
    }
    
    public void increasePoints(){
        this.points++;
        this.list.add(points);
        System.out.println("lisatty pisteet functions metodissa");
        System.out.println("pisteet: "+this.points);
        
    }
    public int getPoints(){
        //System.out.println("return points"+this.points);
        int pal= (int)this.points;
        return pal;
    }
    //lisää monta pistettä sai yhdestä pelistä pelin loputtua
    public void addPoints(int no){
        if(no==1){
            System.out.println("lisätty listalle 1 pisteet");
            list.add(this.points);
        }if(no==2){
            q2list.add(this.points);
        }if(no==3){
            q3list.add(this.points);
        }
    
    }
    public void addNoOfTimesPlayed(int no){
        if(no==1){
            q1no++;
        }if(no==2){
            q2no++;
        }if(no==3){
            q3no++;
        }
    }
    public int noOfTimesPlayed(int no){
        if(no==1){
            return q1no;
        }if(no==2){
            return q2no;
        }if(no==3){
            return q3no;
        }
        return 0;
    }
    
    public double countAverage(int no){
        if(no==1){
            double returnable=0;
            double total=0;
            for(int i=0; i<this.list.size();i++){
                total+=list.get(i);
                returnable=total/list.size();
            }
            System.out.println("laske average 1:"+ returnable);    
            return returnable;   
        }
       if(no==2){
             Double returnable= q2list.stream()
                .mapToDouble(i->i)
                .average().orElse(0.0);
            return returnable;

        }if(no==3){
             Double returnable= q3list.stream()
                .mapToDouble(i->i)
                .average().orElse(0.0);
            return returnable;

        }
        
        return 0.0;
    }
    
    
    
    
    
    /*public void addQA(){
        /*map.put("What kind of fish is Nemo in the movie 'Finding Nemo'?"+"\n"+"a:Tiger Shark b:Salmon c:Clownfish d: Goldfish", "c");
        map.put("Can a white shark control their body temprature?"+"\n"+"a:Yes b:No", "a");
        map.put("Are jellyfish a type of fish?"+"\n"+"a:Yes b:No", "a");
        map.put("What is a group of dolphins called?"+"\n"+"a:Hurricanes b:Nets c:Pods d: School", "c");
        map.put("Can goldfish close their eyes?"+"\n"+"a: Yes but only when sleeping b:Yes, whenever they want c:Only in dirty water d:No, never", "d");
        map.put("Can goldfish smell?"+"\n"+"a:Yes b:No ", "a");
        map.put("What is the fastest fish?"+"\n"+"a:Swordfish b:Racing Shark c: Sail Fish d: Trout", "c");
        map.put("What is the largest species of fish?"+"\n"+"a:Tuna b:Whale Shark c:Tiger Shark d:Blue Whale", "b");
        map.put("How many different fish species are there worldwide?"+"\n"+"a:9000 b:34 000 c:120 000 d: 24 000 000", "b");
       
    }
    
    }*/


    

    
}
