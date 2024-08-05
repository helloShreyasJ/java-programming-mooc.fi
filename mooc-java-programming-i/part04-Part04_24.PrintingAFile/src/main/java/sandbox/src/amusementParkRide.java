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
    
    public double averageHeightOfPeopleOnRide(){
        if (riding.isEmpty()) {
            return -1;
        }

        int sumOfHeights = 0;
        for (Person per: riding) {
            sumOfHeights += per.getHeight();
        }

        return 1.0 * sumOfHeights / riding.size();
    }

    public String toString(){
        
        if(riding.isEmpty()){
            return this.name + ", miniumum height to ride: " + this.minimumHeight + ", visitors: " + this.visitors + "\n" + "riding: \n" + "No one is on the ride";
        }
       String isRiding = " ";
       for(Person person:riding){
            isRiding = isRiding + person.getName()  + "\n";
       }
       return this.name + ", miniumum height to ride: " + this.minimumHeight + ", visitors: " + this.visitors + "\n" + "riding: \n" + isRiding +"\naverage height of people on ride: " + averageHeightOfPeopleOnRide();

    }
    public void removeAllOnRide(){
        
            riding.clear();
        
    }

    
}
