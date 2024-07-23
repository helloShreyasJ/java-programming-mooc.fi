public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    private SimpleDate birthday;

    public Person(String name){
        this(name,0,0,0,new SimpleDate(0,0,0));
    }
    public Person(String name, int height){
        this(name,height,0,0, new SimpleDate(0,0,0));
    }
    public Person(String name,int day,int month,int year){
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }
    public Person(String name, SimpleDate birthday){
        this(name,0,0,0,birthday);
    }
    public Person(String name, int height, int age, int weight,SimpleDate birthday){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.birthday = birthday;
    }

    public void printPerson(){
        System.out.println(this.name + " is " + this.age + " years old");
    }

    public void growOlder(){
        this.age = this.age + 1;
    }
    public void growOlder(int growOlderBy){
        this.age = this.age + growOlderBy;
    }

    public boolean isAdult(){
        if(this.age > 18){
            return true;
        } else{
            return false;
        }
    }
    
    public SimpleDate getBirthday(){
        return this.birthday;
    }
    
    public boolean isOlderThan(Person otherDude){
        int ownYear = getBirthday().getYear();
        int comparedYear = otherDude.getBirthday().getYear();
        if(ownYear < comparedYear){
            return true;
        }
        if(ownYear > comparedYear){
            return false;
        }
        int ownMonth = getBirthday().getMonth();
        int comparedMonth = otherDude.getBirthday().getMonth();
        if(ownMonth < comparedMonth){
            return true;
        }
        if(ownMonth > comparedMonth){
            return false;
        }
        int ownDay = this.getBirthday().getDay();
        int comparedDay = otherDude.getBirthday().getDay();

        if (ownDay < comparedDay) {
            return true;
        }

        return false;
    }

    public boolean olderThan(Person compared){
        if(this.birthday.before(compared.getBirthday())){
            return true;
        } else{
            return false;
        }
    }
    
    public double bodyMassIndex(){
        double heightInMeters = this.height /100;
        return this.weight / (heightInMeters * heightInMeters);
    }

    public String toString(){
        return "This person's name is " + this.name + ", and their birthday is on " + this.birthday;
    }
    
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return this.height;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return this.weight;
    }
    public String getName(){
        return this.name;
    }
}
