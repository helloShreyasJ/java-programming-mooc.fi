
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        Gift gift = new Gift("Book collection",5);
        Gift gift2 = new Gift("PS5", 5);
        
        Package pack = new Package();
        pack.addGift(gift);
        pack.addGift(gift2);
        
        System.out.println(pack.totalWeight());
    }
}
