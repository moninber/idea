package test;

import java.util.ArrayList;
import java.util.Collections;

public class stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","s","d");
        list.stream().forEach(s-> System.out.println(s));

    }
}
