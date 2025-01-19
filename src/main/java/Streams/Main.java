package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Alish");
        list.add("Valish");
        list.add("Toshmat");
        list.add("Eshmat");
        Optional<String>optional=list.stream().skip(list.size()-1).findFirst();

        System.out.println(optional.get());

    }
}