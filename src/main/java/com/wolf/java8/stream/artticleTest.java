package com.wolf.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class artticleTest {
    public static void main(String[] args) {
        List<Article> articleList = new ArrayList<Article>();
        String[] arr = new String[]{"a","b","c","d"};
        Stream<String> s = Arrays.stream(arr);
        s = Stream.of(arr);

        List<Integer> i = Arrays.asList(1,2,3,4);

        Integer reduced = i.stream().reduce(23, (a,b) -> a * b);

        System.out.println(reduced);

        articleList.add(new Article("java","jerry",Arrays.asList("new","awesome","wonderful")));
        articleList.add(new Article("php","frank",Arrays.asList("good","experienced","notbad")));
        articleList.add(new Article("c","liu",Arrays.asList("professional","awesome")));

        Optional res = articleList.stream().filter(article -> article.getTitle().contains("java"))
                            .filter(b -> b.getTags().contains("awesome1")).sorted().findFirst();
       // Optional res = articleList.stream().parallel().findAny();

        Article r = null;
        if (res.isPresent())
            r = (Article) res.get();
        System.out.println(r);
    }
}
