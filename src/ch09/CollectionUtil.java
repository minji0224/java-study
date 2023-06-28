package ch09;

import java.util.List;

public class CollectionUtil <T>{

    public <T> int countOccurrences(List<T> list, T target) { // public int로 해도됨 어차피 리턴값이 int기때문에
        int count = 0;
        for ( T value : list) {
            if (value.equals(target)) {
                count++;
            }
        }
        return count;
    }
}
