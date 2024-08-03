public class amusementParkRide {
    private String name;
    private int minimumHeight;
    private int visitors;

    public amusementParkRide(String name, int minimumHeight){
        this.name = name;
        this.minimumHeight = minimumHeight;
        visitors = 0;
    }

    public boolean isAllowedOn(Person person){
        if(person.getHeight()<this.minimumHeight){
            return false;
        } else{
            visitors++;
            return true;
        }
    }
    public String toString(){
        return "Ride name: " + this.name + "\n Minimum height required to ride: " + this.minimumHeight + "\n Number of visitors currently: " + visitors; 
    }
}
