
/**
 *
 * @author shreyas
 */
import java.util.ArrayList;
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> list;
    
    public Suitcase(int maxWeight){
        list = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        int totalWeight = 0;
        for(Item items:list){
            totalWeight += items.getWeight();
        }
        if(totalWeight + item.getWeight() <= maxWeight){
            list.add(item);
        }
    }
    
    public void printItems(){
        for(Item items:list){
            System.out.println(items);
        }
    }
    
    public Item heaviestItem(){
        Item returnHeaviest = new Item("",0);
        
        if(list.isEmpty()){
            return null;
        }
        for(Item item:list){
            if(returnHeaviest.getWeight() < item.getWeight()){
                returnHeaviest = item;
            }
        }
        return returnHeaviest;
    }
    
    public String listItems(){
        String listItems = "";
        for(Item item: list){
            listItems += item + "\n";
        }
        return listItems;
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Item items:list){
            totalWeight += items.getWeight();
        }
        return totalWeight;
    }
    
    public String toString(){
        int calculateWeight = 0;
        
        if(list.isEmpty()){
            return "no items" + " (" + calculateWeight + " kg)";
        }
        
        
        
        for(Item item:list){
            calculateWeight += item.getWeight();
        }
        
        if(list.size() == 1){
            return list.size() + " item" + " (" + calculateWeight + " kg)";
        }
        
        return list.size() + " items (" + calculateWeight + " kg)";
    }
}
