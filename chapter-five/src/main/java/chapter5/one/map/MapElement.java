package chapter5.one.map;

import chapter4.core.Dish;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class MapElement {

    public static void main(String[] args) {

        List<String> dishesName = Dish.menu.stream()
                .map(Dish::getName).collect(Collectors.toList());

        System.out.println(dishesName);

        // but how if we want to traverse every element in the menu and getName and the length of every dish name
        // it means that we want to map the length method on every name

        List<Integer> dishesNameLength = Dish.menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(dishesNameLength);

        IntStream

    }

}
