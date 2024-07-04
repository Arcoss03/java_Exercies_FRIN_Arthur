package Collection2;

import java.util.ArrayList;
import java.util.Collections;

public class Exo3 {

    @SuppressWarnings("unchecked")
    public static  void main(String[] args) {
        @SuppressWarnings("rawtypes")
        ArrayList aList = new ArrayList();
        //Add elements to ArrayList object
        aList.add("1");
        aList.add("2");
        aList.add("3");
        aList.add("4");
        aList.add("5");
        Collections.reverse(aList);
        System.out.println("After Reverse Order, ArrayList Contains : " + aList);
    }

    
}
