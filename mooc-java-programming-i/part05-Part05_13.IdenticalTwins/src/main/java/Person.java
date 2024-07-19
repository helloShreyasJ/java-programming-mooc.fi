
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    // aight
    
    public boolean equals(Object compared){
        //variables located in the same position are equal
        if(this == compared){
            return true;
        }
        //if the type compared is not Person, then the objects are not equal
        if(!(compared instanceof Person)) {
            return false;
        }
        //now, to convert the object type compared object into a Person object
        Person comparedPerson = (Person) compared;
        
        //if the values of the objects variables are equal then the objects are equal
        if (this.name.equals(comparedPerson.name) &&
            this.weight == comparedPerson.weight &&
            this.height == comparedPerson.height &&
            this.birthday.getDay() == comparedPerson.birthday.getDay()&&
            this.birthday.getMonth() == comparedPerson.birthday.getMonth()&&
            this.birthday.getYear() == comparedPerson.birthday.getYear()){
            return true;
        } return false;
    }
}
