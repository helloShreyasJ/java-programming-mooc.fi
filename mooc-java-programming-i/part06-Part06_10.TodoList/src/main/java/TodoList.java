
/**
 *
 * @author shreyas
 */
import java.util.Scanner;
import java.util.ArrayList;
public class TodoList {
    private Scanner scanner;
    private ArrayList<String> list;
    public TodoList(){
        list = new ArrayList<String>();
    }
    public void add(String task){
        list.add(task);
    }
    public void print(){
        int index = 1;
        for(String task:list){
            System.out.println(index + ":" + task);
            index++;
        }
    }
    public void remove(int number){
        if(number != 0){
            list.remove(list.get(number - 1));
        }
    }
}
