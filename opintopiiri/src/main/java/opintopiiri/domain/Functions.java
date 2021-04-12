
package opintopiiri.domain;

import java.util.ArrayList;
import opintopiiri.ui.UI;

public class Functions {
    UI ui;
    double points;
    private ArrayList<Double> list;

    
    public Functions(UI ui){
        this.ui=ui;
        this.points=0;
        this.list=new ArrayList<>();
    }
    
    public void increasePoints(){
        this.points++;
        this.list.add(points);
        
    }
    public double countAverage(){
        Double returnable= list.stream()
                .mapToDouble(i->i)
                .average().orElse(0.0);
        
        return returnable;
    }
    

    
}
