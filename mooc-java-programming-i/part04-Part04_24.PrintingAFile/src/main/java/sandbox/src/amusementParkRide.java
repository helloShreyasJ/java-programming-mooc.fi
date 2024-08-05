import java.util.ArrayList;
public class amusementParkRide {
    private String name;
    private int minimumHeight;
    private int visitors;
    private ArrayList<Person> riding;

    public amusementParkRide(String name, int minimumHeight){
        this.name = name;
        this.minimumHeight = minimumHeight;
        visitors = 0;
        this.riding = new ArrayList<>();
    }

    public boolean isAllowedOn(Person person){
        if(person.getHeight()<this.minimumHeight){
            return false;
        } else{
            visitors++;
            riding.add(person);
            return true;
        }
    }
    public String toString(){
       String isRiding = " ";
       for(Person person:riding){
            isRiding = isRiding + person.getName()  + "\n";
       }
       return this.name + ", miniumum height to ride: " + this.minimumHeight + ", visitors: " + this.visitors + "\n" + "riding: \n" + isRiding;
    }
}
