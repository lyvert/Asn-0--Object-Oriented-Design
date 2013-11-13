
import java.util.ArrayList;


/** 
 * @author lyverc Chris Lyver
 * @version 2013-09-10
 * lyverc@ccs.neu.edu
 * Assignment 0  9/10/13
 * this class contains my bubble sort method
 */

public class MyAlgorithms {

/**This methods sorts an array list alphabetically
 * @param slist takes the argument*/    
    public static void sort(ArrayList<String> slist) {
        int x = 0;
        while (slist.size() > x) {
            for (int i = 0; i < slist.size() - 1 ; i++ ) {
                if (slist.get(i).compareTo(slist.get(i + 1)) > 0) {
                    String temp = slist.get(i);
                    slist.set(i, slist.get(i + 1));
                    slist.set(i + 1, temp);
                    System.out.println(slist);
                }    
            }
            x = x + 1;
        }
    }
}
