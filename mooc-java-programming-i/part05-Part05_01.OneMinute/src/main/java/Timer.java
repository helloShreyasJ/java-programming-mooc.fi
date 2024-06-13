
/**
 *
 * @author shreyas
 */
public class Timer {
    private ClockHand hundOfSecond;
    private ClockHand seconds;
    
    public Timer(){
        this.hundOfSecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance(){
        this.hundOfSecond.advance();
        
        if(this.hundOfSecond.value() == 0){
            this.seconds.advance();
            
        }
    }
    
    public String toString(){
        return this.seconds + ":" + this.hundOfSecond;
    }
}
