
/**
 *
 * @author shreyas
 */
import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList <Suitcase> hold;
    
    public Hold(int maxWeight){
        hold = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        int totalWeight = 0;
        
        for(Suitcase suitcases:hold){
            totalWeight += suitcases.totalWeight();
        }
            
        if(totalWeight + suitcase.totalWeight() <= maxWeight){
            hold.add(suitcase);
        }
    }
    
    public void printItems(){
         
        for(Suitcase suitcases: hold){
            System.out.println(suitcases.listItems());
        }
    }
    
    public String toString(){
        int calculateWeight = 0;
        
        for(Suitcase suitcase:hold){
            calculateWeight += suitcase.totalWeight();
        }
        return hold.size() + " suitcases (" + calculateWeight + " kg)";
    }
}
