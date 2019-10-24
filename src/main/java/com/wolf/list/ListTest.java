package com.wolf.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {


        List<String> a = new ArrayList<String>();

        a.add("a");
        a.add("b");
        a.add("c");

        List<String> b = new ArrayList<String>();

        b.add("e");
        b.add("f");

        List<String> all = new ArrayList<String>();
        all.addAll(a);
        all.addAll(b);
        System.out.println("a:" + all.size());
     }
}
