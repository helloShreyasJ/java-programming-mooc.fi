public class Main {
    public static void main(String[] args) {
        Person jake = new Person("jake", 25,2,2000);
        Person josh = new Person("josh",12,2,2007);
        
        //to check if josh is older than jake
        System.out.println(josh.getName() + " is older than " + jake.getName() +": " + josh.isOlderThan(jake)) ;

        SimpleDate d1 = new SimpleDate(25, 2, 2013);
        SimpleDate d2 = new SimpleDate(21, 3, 2013);
        
        //to check if d2 comes before d1

        System.out.println("d2 comes before d1: " + d2.before(d1));

        //to check if d1 comes before d2

        System.out.println("d1 comes before d2 " + d1.before(d2));
    }
}
