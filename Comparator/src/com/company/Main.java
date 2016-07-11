package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Init
        List<Integer> intList= new ArrayList<Integer>(Arrays.asList(1, 7, 8, 9, 3, 4));
        Object[] objList= intList.toArray();

        Comparator<Integer> comparator
                = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };

//        Arrays.sort(objList, Collections.reverseOrder());
//        Arrays.sort((Integer[]) objList, comparator);
//        Arrays.sort((Integer[]) objList, comparator);
//
//        for(Object obj: objList)
//        {
//            System.out.print(obj + "\t");
//        }
        Integer[] iList = new Integer[] {1,2,3,4,5};

        Object[] o = iList;
        Integer[] ia = (Integer[]) o;

        for(Object i: ia)
        {
            System.out.print(i + "\t");
        }

    }
}
