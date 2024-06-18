
/**
 *
 * @author shreyas
 */
public class Counter {
    private int count;
    
    public Counter(int startvalue){
        count = startvalue;
    }
    public Counter(){
        count = 0;
    }
    public int value(){
        return count;
    }
    public void increase(){
        count++;
    }
    public void increase(int increaseBy){
        if(increaseBy > 0){
        count = count + increaseBy;
        }
    }
    public void decrease(){
            count = count - 1;
    }
    public void decrease(int decreaseBy){
        if(decreaseBy>0){
            count = count - decreaseBy;
        }
    }
}
