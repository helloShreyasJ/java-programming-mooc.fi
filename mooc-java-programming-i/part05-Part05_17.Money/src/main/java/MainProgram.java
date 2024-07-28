
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        
        Money firstObject = new Money(10,0);
        Money secondObject = new Money(7,40);
        Money firstMinusSecond = firstObject.minus(secondObject);
        System.out.println(firstMinusSecond.euros());
        System.out.println(firstMinusSecond.cents());
        System.out.println(firstMinusSecond);
    }
}
