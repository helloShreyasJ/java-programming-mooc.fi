
/**
 *
 * @author shreyas
 */
import java.util.ArrayList;

public class Stack {
    private ArrayList <String> stack;
    
    public Stack(){
        this.stack = new ArrayList<>();
    }
    public boolean isEmpty(){
        if(this.stack.size() == 0){
            return true;
        }else{
            return false;
        }
    }
    public void add(String value){
        this.stack.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stack;
    }
    public String take(){
        
        if(stack.isEmpty()){
            return null;  
        }else{
            return stack.remove(stack.size() - 1);
        }
    }
}
