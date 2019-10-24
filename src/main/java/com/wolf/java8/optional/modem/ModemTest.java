package com.wolf.java8.optional.modem;

import java.util.Optional;

public class ModemTest {
    public static void main(String[] args) {
        Modem modem = new Modem();
        modem.setPrice(14.0);
        System.out.println(priceInRange(modem));
        Modem modem2 = null;
        System.out.println(priceInRange(modem2));

    }

    private static boolean priceInRange(Modem modem) {
        return Optional.ofNullable(modem)
                    .map(Modem::getPrice)
                    .filter(p -> p >= 10.0)
                    .filter(p -> p <= 15.0)
                    .isPresent();
    }
}
