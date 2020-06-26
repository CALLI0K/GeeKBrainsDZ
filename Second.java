package HW3;

import java.util.ArrayList;
import java.util.Collections;

class Hw3_1TestHelper {
    public static <T> ArrayList testOne(T[] array) {
        ArrayList<T> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, array);
        return arrayList;
    }

    public static <T> ArrayList testTwo(T[] array,int start, int end) {
        T tmp = array[start];
        array[start]=array[end];
        array[end]=tmp;
        ArrayList<T> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, array);
        return arrayList;
    }
}