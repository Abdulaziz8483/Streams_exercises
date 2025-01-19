package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("Alish");
        list.add("Valish");
        list.add("Toshmat");
        list.add("Eshmat");
        Optional<String>optional=list.stream().skip(list.size()-1).findFirst();

        System.out.println(optional.get());



        char c='m';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter : ");
        String s = scanner.nextLine();

        long count=Streams_Exercises.Unique(s).filter(value -> value==c).count();

         System.out.println(count);


    }
}