public class Counter {
    private int value;

    public Counter(){
        this(0);
    }
    public Counter(int initialValue){
        this.value = initialValue;
    }
    public int increaseValue(){
        return this.value = value + 1;
    }
    public int increaseValue(int increaseBy){
        return this.value = this.value + increaseBy;
    }
    public String toString(){
        return "Counter value: " + this.value;
    }
    public Counter clone(){
        Counter clone = new Counter(this.value);
        return clone;
    }
}
