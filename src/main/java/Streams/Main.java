package Streams;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


//        List<String> list = new ArrayList<String>();
//        list.add("Alish");
//        list.add("Valish");
//        list.add("Toshmat");
//        list.add("Eshmat");
//        Optional<String>optional=list.stream().skip(list.size()-1).findFirst();
//
//        System.out.println(optional.get());


//        char c='m';
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter : ");
//        String s = scanner.nextLine();
//
//        long count=Streams_Exercises.Unique(s).filter(value -> value==c).count();
//
//         System.out.println(count);

        Integer[] numbers = {5, 13, 4, 13, 13, 27, 2, 59, 59, 34};

        Set<Integer> numSet = new HashSet<>();
        List<Integer> numList = Arrays.stream(numbers)
                .filter(num -> !numSet.add(num))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(numList);

        Integer [] integers={1,2,3,4,5};


        List<Integer> integers2=Arrays.stream(integers)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(integers2);

    }
}