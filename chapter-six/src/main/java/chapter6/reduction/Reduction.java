package chapter6.reduction;

import chapter4.core.Dish;

import java.util.stream.Collectors;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class Reduction {
    /**
     * All the collectors we’ve discussed in CollectorsApi class  so far are, in reality, only convenient specializations of a reduction process
     * that can be defined using the reducing factory method.
     */


    public static void main(String[] args) {
        reduction();
        sumOfCalories();
        sumOfCalories2();
    }
    private static void reduction(){
        // we can calculate the sum of all calories in the Dish.menu with reducing

        // same behaviour
        Integer collect = Dish.menu.stream().collect(Collectors.reducing(0, Dish::getCalories, (i, j) -> i + j));
        Integer collect2 = Dish.menu.stream().map(Dish::getCalories).reduce(0, (i, j) -> i + j);

        System.out.println(collect);
    }


    private static void sumOfCalories(){
        // there is many ways

        Integer collect = Dish.menu.stream().collect(Collectors.reducing(0, Dish::getCalories, Integer::sum));

        System.out.println(collect);
    }

    private static void sumOfCalories2(){
        Integer reduce = Dish.menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);

        System.out.println(reduce);
    }
}
