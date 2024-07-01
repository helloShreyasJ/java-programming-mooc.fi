public class anotherMain {
    public static void main(String[] args) {
        Person jake = new Person("jake",149);
        Person jasper = new Person("jasper",138);
        Amusementpark leapOfFaith = new Amusementpark("leap of faith", 140);

        if(leapOfFaith.AllowedToRide(jasper)){
            System.out.println(jasper.getName() + " may enter the ride");
        }else{
            System.out.println(jasper.getName() + "may NOT enter the ride");
        }

        if(leapOfFaith.AllowedToRide(jake)){
            System.out.println(jake.getName() + " may enter the ride");
        } else{
            System.out.println(jake.getName() + " may NOT enter the ride");
        }
        System.out.println(leapOfFaith);
    }
}
