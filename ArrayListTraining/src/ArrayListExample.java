import java.util.*;

public class ArrayListExample {
    public void create(){
        ArrayList<String> foods = new ArrayList<String>();
        // ArrayList<Type> name = new ArrayList<Type>();  
        // Array.length => ArrayList.size();
        // Array[0] => ArrayList.get(0);
        // Array[1] = x  => ArrayList.set(1, x);
        // ArrayList.remove(index);
        // ArrayList.clear(); 
    
        foods.add("Pizza");
        foods.add("Ice Cream");
        foods.add("Porkchop");
                                                                
        for(int i=0; i<foods.size(); i++){ System.out.println(foods.get(i)); }
    }
}
