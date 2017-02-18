package chapter4.beforeJava8;

import chapter4.core.Dish;

import java.util.*;

/**
 * @author Al   i yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class Java7 {

    // lest us see the code we will implement before java 8

    public static void main(String[] args) {

        System.out.println(Arrays.toString(
                getTheLowCaloriesDishesNames(sortDishesByAntonymClass(filterByLowCalories(Dish.menu)))
                        .toArray()));

    }


    private static List<Dish> filterByLowCalories(List<Dish> dishes) {
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish d : dishes) {
            if (d.getCalories() < 400) {
                lowCaloricDishes.add(d);
            }
        }
        return lowCaloricDishes;
    }


    private static List<Dish> sortDishesByAntonymClass(List<Dish> lowCaloriesDishes){
        Collections.sort(lowCaloriesDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return Integer.compare(o1.getCalories(),o2.getCalories());
            }
        });
        return lowCaloriesDishes;
    }

    private static List<String> getTheLowCaloriesDishesNames(List<Dish> lowCaloriesDishes){
        List<String> lowCaloriesDishesNames= new ArrayList<>();
        for (Dish d : lowCaloriesDishes){
            lowCaloriesDishesNames.add(d.getName());
        }
        return lowCaloriesDishesNames;
    }
}
