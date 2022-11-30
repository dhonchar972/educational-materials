package org.ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 7);
        System.out.println(list.stream().map(v -> ++v).toList());
    }
}
