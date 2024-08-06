
/**
 *
 * @author shreyas
 */
import java.util.ArrayList;
public class Room {
    private ArrayList<Person> list;
    
    public Room(){
        list = new ArrayList<>();
    }
    
    public void add(Person person){
        list.add(person);
    }
    
    public boolean isEmpty(){
        //returns boolean type value true or false that tells whether the room is empty or nah
        if(list.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
    
    public ArrayList <Person> getPersons(){
        return list;
    }
    
    public Person shortest(){
        Person returnShortest = new Person("",1000);
        if(list.isEmpty()){
            return null;
        }
            
        for(Person person:list){
                if(returnShortest.getHeight() > person.getHeight()){
                returnShortest = person;
            }
        }
            return returnShortest;
    } 
    
    public Person take(){
        Person returnShortest = new Person("",1000);
        if(list.isEmpty()){
            return null;
        }
            
        for(Person person:list){
                if(returnShortest.getHeight() > person.getHeight()){
                returnShortest = person;
            }
        }
        list.remove(returnShortest);
        return returnShortest;
    }
}
