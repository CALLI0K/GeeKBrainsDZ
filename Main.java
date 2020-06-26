package HW3;

import HW2.Test;

import java.util.ArrayList;

import static HW3.Hw3_1TestHelper.testOne;
import static HW3.Hw3_1TestHelper.testTwo;

class Hw3_1 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        String[] strings = {"first", "second", "third", "fourth"};
        ArrayList firstList = testOne(strings);
        System.out.println(firstList.toString());

        ArrayList secondList = testOne(numbers);
        System.out.println(secondList.toString());
        //////////////////////////////////////////
        firstList = testTwo(strings,0,1);
        System.out.println(firstList.toString());

        testTwo(numbers,0,3);
        secondList = testTwo(numbers,1,2);
        System.out.println(secondList.toString());
        ////////////////////////////////////

    }
}
