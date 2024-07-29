public class Main {
    public static void main(String[] args) {
        //testing the meals class
        Menu menu = new Menu();
        menu.addMeal("dal");
        menu.addMeal("paratha");
        menu.addMeal("rice");
        menu.addMeal("dosa");
        menu.printMeals();
        System.out.println();
        menu.clearMenu();
        menu.printMeals();
        System.out.println();
    }
}
