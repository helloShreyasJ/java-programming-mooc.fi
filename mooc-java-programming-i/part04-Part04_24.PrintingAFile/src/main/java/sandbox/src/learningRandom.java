import java.util.Random;
public class learningRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(5)+1;
        System.out.println(x);
    }
}
