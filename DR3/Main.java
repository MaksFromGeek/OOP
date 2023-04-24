package org.example.DR3;

import java.util.*;
/**
 * Перестроить домашнюю работу из 1 семинара с добавлением возможностей итерирования (iterable) и
 * компарации (comparable, comparator).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("ВОДА");
        List<Product> water = new ArrayList<>();
        water.add(new BottleOfWater("water 0.5l", 50.0, 50));
        water.add(new BottleOfWater("water 1l", 100.0, 100));
        water.add(new BottleOfWater("water 1.5l", 150.0, 150));
        water.add(new BottleOfWater("water 2l", 200.0, 200));

        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(water);
        BottleOfWater bottleOfWater = machine.getProduct("water 1l", 100);
        System.out.println(water);

        System.out.println("Список воды без сортировки:");
        for (Product el : water)
            System.out.println(el);

        System.out.println();
        System.out.println("Список воды c сортировкой по имени используя Iterator:");
        water.sort(new SortName());
        Iterator<Product> iterator = water.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        System.out.println("ГОРЯЧИЕ НАПИТКИ");
        List<Product> hotDrinks = new ArrayList<>();
        hotDrinks.add(new HotDrink("coffee", 200.0, 200, 100));
        hotDrinks.add(new HotDrink("tee", 500.0, 300, 90));
        hotDrinks.add(new HotDrink("coffee", 100.0, 200, 110));
        hotDrinks.add(new HotDrink("tee", 300.0, 300, 90));

        HotDrinkVendingMachine machine2 = new HotDrinkVendingMachine(hotDrinks);
        HotDrink drink = machine2.getProduct("tee", 300, 90);
        System.out.println(drink);

        System.out.println("Список горячих напитков без сортировки:");
        for (Product el : hotDrinks)
            System.out.println(el);

        System.out.println();
        System.out.println("Список горячих напитков c сортировкой по цене используя Iterator:");
        hotDrinks.sort(new SortCost());
        Iterator<Product> it = hotDrinks.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}