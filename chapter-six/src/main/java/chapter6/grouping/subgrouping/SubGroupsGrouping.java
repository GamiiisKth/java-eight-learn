package chapter6.grouping.subgrouping;

import chapter4.core.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class SubGroupsGrouping {
    public enum Vegetarian {
        VEGETARIAN,
        NO_VEGETARIAN
    }

    public static void main(String[] args) {
        //  dishMenuCountEachType();
        findHighestCalorieInEachSubGroup();
    }

    private static void dishMenuCountEachType() {

        Map<Dish.Type, Map<Vegetarian, List<Dish>>> collect = Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.groupingBy(t ->
                {
                    if (t.isVegetarian()) {
                        return Vegetarian.VEGETARIAN;
                    } else {
                        return Vegetarian.NO_VEGETARIAN;
                    }
                }

        )));
        System.out.println(collect);
    }

    private static void findHighestCalorieInEachSubGroup() {
        Map<Dish.Type, Dish> mostCaloriesByType = Dish.menu
                .stream().collect(
                        Collectors.groupingBy(Dish::getType,
                                Collectors.collectingAndThen(Collectors.maxBy(
                                        Comparator.comparingInt(
                                                Dish::getCalories)), Optional::get)));

        System.out.println(mostCaloriesByType);
    }

}
