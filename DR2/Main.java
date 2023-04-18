package org.example.DR2;

import java.util.Set;

import static org.example.DR2.HardwareStore.createBase;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> base = createBase(30);
        System.out.printf("%nВ нашем магазине представлено %d ноутбуков:%n", base.size());
        UserFilter filter = new UserFilter(base);
        while (filter.isUserHere()) {
            filter.askFilter();
        }
    }
}