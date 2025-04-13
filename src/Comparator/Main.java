package Comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Radha", 90));
        list.add(new Student("Amit", 85));
        list.add(new Student("Zoya", 95));

        // Comparator for name
        list.sort(Comparator.comparing(student -> student.name));

        list.forEach(System.out::println);
    }
}

