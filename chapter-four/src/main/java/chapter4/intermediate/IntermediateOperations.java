package chapter4.intermediate;

import chapter4.core.Dish;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class IntermediateOperations {


    public static void main(String[] args) {

        List<String> lowCaloriesDishes = Dish.menu.stream()
                .filter(d -> {
                    System.out.println("Dish name: " + d.getName());
                    return d.getCalories() > 300;
                })
                .map(d -> {
                    System.out.println("Mapping : " + d.getName());
                    return d.getName();
                })
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(lowCaloriesDishes);

    }


}
