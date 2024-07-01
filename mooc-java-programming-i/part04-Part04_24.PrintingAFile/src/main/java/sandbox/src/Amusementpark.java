public class Amusementpark {
    private String name;
    private int lowestHeight;

    public Amusementpark(String name, int lowestheight){
        this.name = name;
        this.lowestHeight = lowestheight;
    }

    public boolean AllowedToRide(Person person){
        if(person.getHeight() < this.lowestHeight){
            return false;
        } else {
            return true;
        }
    }

    public String toString(){
        return "Name: " + this.name + ", " + this.lowestHeight; 
    }
}
