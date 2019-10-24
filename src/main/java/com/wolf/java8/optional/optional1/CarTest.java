package com.wolf.java8.optional.optional1;

import javax.smartcardio.Card;
import java.util.*;
import java.util.stream.Collectors;

public class CarTest {
    public static void main(String[] args) {
        Car[] carArr = new Car[] { new Car("Toyota", 111),
                            new Car("Jeep",113)};

        String name = null;
        Optional<String> oStr = Optional.ofNullable(name);
        oStr.ifPresent(System.out::println);

        Optional<List<Car>> optionalCarList = Optional.of(Arrays.asList(carArr));

        Optional<String> stringOptional = Optional.ofNullable("Jerry");

        Optional<String> res2 = stringOptional.map((value) -> value.toUpperCase());
        res2.isPresent(System.out::println);

        //String result = stringOptional.map(() -> String::toUpperCase);
        System.out.println(stringOptional.map(String::toUpperCase).orElse("Jessica"));
        //optionalCarList.map(cars -> cars.get(0).getBrandName()).orElse(Collections.emptyList());


    }

    /*public static Car findCar(List<Car> carList, ) {
        if (car.getBrandName().equals())
    }

     */
}
