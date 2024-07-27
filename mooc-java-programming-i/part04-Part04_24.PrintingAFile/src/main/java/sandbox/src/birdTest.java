import java.util.ArrayList;

public class birdTest {
    public static void main(String[] args){
        ArrayList <Bird> birds = new ArrayList <>();
        Bird red = new Bird("red");

        if(birds.contains(red)){
            System.out.println("The list contains red");
        } else{
            System.out.println("The list does not contain red");
        }

        birds.add(red);
        if(birds.contains(red)){
            System.out.println("The list contains red");
        } else{
            System.out.println("The list does not contain red");
        }
        red = new Bird("Red");

        if(birds.contains(red)){
            System.out.println("The list contains red");
        } else{
            System.out.println("The list does not contain red");
        }

        /*
         * What I understood from the output:
         * if the
         */
    }
}
