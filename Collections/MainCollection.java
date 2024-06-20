package Collections;

import java.util.HashMap;
import java.util.Map;

public class MainCollection {
    public static void main(String[] args) {
        Map<Personnage, Region> origin = new HashMap<>();
        Personnage p1 = new Personnage("Alice", "Bob", 25);
        Personnage p2 = new Personnage("Alice", "Bob", 25);
        Region r1 = new Region("Paris", "France", 75000);
        Region r2 = new Region("Londre", "Royaume Uni", 65000);

        origin.put(p1, r1);
        origin.put(p2, r2);
        
        System.out.println(origin);

    
    }
}