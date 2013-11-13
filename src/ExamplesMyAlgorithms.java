/**
 * @author lyverc (1.0)
 *
 * This file contains my tests for the sort method
 */

import java.util.ArrayList;

import tester.*;

/** this class contains the methods need to test the sort
 * 
 * @version 2013-09-10
 * @author lyverc
 */

class ExamplesMyAlgorithms {
    
    /**
     * sets up an unorded list
     */
    ArrayList<String> list1 = new ArrayList<String>();

    /**
     * sets up an ordered list
     */
    ArrayList<String> list2 = new ArrayList<String>();
    /**this method initializes the list to be tested*/

    void init() {
        list1.add("a");
        list1.add("c");
        list1.add("d");
        list1.add("b");

        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
    }

    /**this method compares the sorted list to the correct list
     *@param t comes from the tester library*/
    void testSort(Tester t) {
        init();
        MyAlgorithms.sort(list1);
        t.checkExpect(list1, list2);
    }
}