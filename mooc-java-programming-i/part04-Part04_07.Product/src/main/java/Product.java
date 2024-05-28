public class Product {
    
    private double price;
    private int quantity;
    private String name;

    public Product(String initialName, double initialPrice, int initialQuanity){
        
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuanity;   
    }
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
}
