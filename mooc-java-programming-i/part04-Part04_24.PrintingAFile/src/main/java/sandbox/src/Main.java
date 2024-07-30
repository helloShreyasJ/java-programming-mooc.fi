import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      // testing out sayGoodMorning
      Scanner sc = new Scanner(System.in);sayGoodMorning greeter = new sayGoodMorning();
      System.out.println("This program will greet you with a warm Good Morning");
      System.out.println();
      System.out.println("What is your name?");
      String name = sc.nextLine();
      System.out.println();
      System.out.println("How many times would you like to be greeted?");
      int times = Integer.valueOf(sc.nextLine());
      greeter.setTimes(times);
      greeter.greet(name);
    }
}
