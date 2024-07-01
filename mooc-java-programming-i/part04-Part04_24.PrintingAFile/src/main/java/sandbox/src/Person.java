public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name){
        this(name,0,0,0);
    }
    public Person(String name, int height){
        this(name,height,0,0);
    }
    public Person(String name, int height, int age, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
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
    public double bodyMassIndex(){
        double heightInMeters = this.height /100;
        return this.weight / (heightInMeters * heightInMeters);
    }

    public String toString(){
        return this.name + " is " + this.age + " years old, and their BMI is " + bodyMassIndex();
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
