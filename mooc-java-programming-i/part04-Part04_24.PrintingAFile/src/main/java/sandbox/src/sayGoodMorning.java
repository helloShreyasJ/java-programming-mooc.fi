public class sayGoodMorning{
    private int timesToGreet;

    public void setTimes(int times){
        timesToGreet = times;
    }
    public void greet(String name){
        for(int i = 0; i <= timesToGreet; i++){
            System.out.println("Good morning " + name + " !");
            try{
            Thread.sleep(200);
            } catch(Exception e){
            }
        }
    }
}