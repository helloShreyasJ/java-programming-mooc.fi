
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        
        if(elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        String collectionListed = "";
        
        for(String element: elements){
            if (elements.size() <= 1) {
                collectionListed = element;
            } else {
                collectionListed = collectionListed + element + "\n";
            }
        }
        String elementString = "";
        
        if (elements.size() > 1) {
            elementString = "elements:\n";
        } else {
            elementString = "element:\n";
        }
        
        return "The collection " + this.name + " has " + elements.size() + " " + elementString + collectionListed;
        
    }
    
}
