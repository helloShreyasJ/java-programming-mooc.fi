
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu(){
        this.meals = new ArrayList<>();
    }
    public void addMeal(String meal){
        if(this.meals.contains(meal)){
            return;
        } else{
            this.meals.add(meal);
        }
    }
    public void printMeals(){
        for(String meal:this.meals){
            System.out.println(meal);
        }
    }
    public void clearMenu(){
        //its gonna clear the list
        this.meals.clear();
    }
}
