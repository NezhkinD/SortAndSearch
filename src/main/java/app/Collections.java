package app;

import java.util.Comparator;
import java.util.List;

public class Collections {
    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key){
        return java.util.Collections.binarySearch(list, key);
    }

    public static <T> int binarySearch(List<T> list, T key, Comparator<T> c){
        return java.util.Collections.binarySearch(list, key, c);
    }
}
