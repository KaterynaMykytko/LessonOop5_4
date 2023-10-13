package org.courses.ex5_4;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numberslist = new ArrayList<>();

        numberslist.add(5);
        numberslist.add(8);
        numberslist.add(3);
        numberslist.add(7);
        numberslist.add(9);
        numberslist.add(13);
        numberslist.add(11);
        numberslist.add(28);
        numberslist.add(21);
        numberslist.add(15);

        Iterator<Integer> iterator = numberslist.iterator();

        while (iterator.hasNext()){
            Integer number = iterator.next() + 1;
            System.out.print(number + "\t");
        }

    }
}
