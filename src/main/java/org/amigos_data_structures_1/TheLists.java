package org.amigos_data_structures_1;

import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("blue"));

        colors.forEach(x -> {
            System.out.println(x + " ,");
        });

        for(int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        List<String> unmodifiable_list = List.of("blue", "red");
        //unmodifiable_list.add("black"); //cannot add
        System.out.println(unmodifiable_list);
    }
}
