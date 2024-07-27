public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increaseValue();
        counter.increaseValue();
        System.out.println(counter);

        Counter clone = counter.clone();

        System.out.println(counter);
        System.out.println(clone);

        counter.increaseValue(4);
        System.out.println(counter);
        System.out.println(clone);
       
        clone.increaseValue(2);
        System.out.println(counter);
        System.out.println(clone);
    }
}
