package ch09;

import account.Account;
import com.myuniversity.students.Student;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);

        int target = 1;

        CollectionUtil<Integer> util = new CollectionUtil<>();
        int occurrenceCount = util.countOccurrences(numbers, target);

        System.out.println("리스트 안에 " + target +"의 값은 " + occurrenceCount + "개 있습니다.");


        List<String> strList = new ArrayList<>();
        strList.add("apple");
        strList.add("banana");
        strList.add("apple");
        strList.add("cherry");
        strList.add("durian");
        strList.add("melon");

        String target1 = "apple";

        CollectionUtil<String> util1 = new CollectionUtil<>();
        int occurrenceCount1 = util1.countOccurrences(strList, target1);

        System.out.println("리스트 안에 " + target1 +"의 값은 " + occurrenceCount1 + "개 있습니다.");


        Cache<Student> c = new Cache<Student>();
        c.setData(new Student("고대근"));
        Student s = c.getData();

        Cache<Account> a = new Cache<>();
        a.setData(new Account("001", 5));
        Account acc = a.getData();




    }
}
