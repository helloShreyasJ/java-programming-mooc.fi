public class Main{
    public static void main(String[] args) {
        Person joe = new Person("joe");
        joe.setHeight(180);
        joe.setWeight(72);;

        Person jake = new Person("jake");
        jake.setHeight(186);
        joe.setWeight(65);

        amusementParkRide deathLeap = new amusementParkRide("death leap", 160);

        if (deathLeap.isAllowedOn(joe)) {
            System.out.println(joe.getName() + " is allowed on the ride");
        } else {
            System.out.println(joe.getName() + " is not allowed on the ride");
        }
        
        if (deathLeap.isAllowedOn(jake)) {
            System.out.println(jake.getName() + " is allowed on the ride");
        } else {
            System.out.println(jake.getName() + " is not allowed on the ride");
        }
        System.out.println(deathLeap);

        deathLeap.removeAllOnRide();
        System.out.println(deathLeap.averageHeightOfPeopleOnRide());
        System.out.println();
        System.out.println(deathLeap);
    }
}