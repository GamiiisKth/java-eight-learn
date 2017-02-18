package chapter4.beforeJava8;

import chapter4.core.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class Java8 {


    // same code as java7 but see the different
    public static void main(String[] args) {


        List<String> lowCaloricDishesName= Dish.menu
                .stream()
                // select dishes that they are below 400
                .filter((d)-> d.getCalories()<400)
                // sort them by calories
                .sorted(Comparator.comparing(Dish::getCalories))
                // extract the name of dishes
                .map(Dish::getName)
                // store all the name in a List
                .collect(Collectors.toList());

        lowCaloricDishesName.forEach(System.out::println);
    }
}
