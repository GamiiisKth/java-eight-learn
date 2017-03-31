package chapter6.grouping;

import chapter4.core.Dish;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class Grouping {

    public enum CaloricLevel {DIET, NORMAL, FAT}

    public static void main(String[] args) {

        groupingByDishType();
        groupingByCaloriesLevel();
        groupingByTypeAndCaloriesLevel();
    }


    private static void groupingByDishType() {
        Map<Dish.Type, List<Dish>> menuType = Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType));

        System.out.println(menuType);

    }

    private static void groupingByCaloriesLevel() {

        Map<CaloricLevel, List<Dish>> caloricLevelListMap = Dish.menu.stream().collect(Collectors.groupingBy(t -> {
            if (t.getCalories() <= 400) {
                return CaloricLevel.DIET;
            } else if (t.getCalories() <= 700) {
                return CaloricLevel.NORMAL;
            } else {
                return CaloricLevel.FAT;
            }

        }));

        System.out.println(caloricLevelListMap);
    }


    /**
     * Now you’ve seen how to group the dishes in the menu, both by their type and by calories, but what if you want to use
     * both criteria at the same time? Grouping is powerful because it composes effectively. Let’s see how to do this.
     */

    private static void groupingByTypeAndCaloriesLevel() {

        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishTypeAndCaloriesLevel = Dish.menu.stream().collect(Collectors.groupingBy(Dish::getType, Collectors.groupingBy(dish -> {
            if (dish.getCalories() <= 400) {
                return CaloricLevel.DIET;
            } else if (dish.getCalories() <= 700) {
                return CaloricLevel.NORMAL;
            } else {
                return CaloricLevel.FAT;
            }

        })));

        System.out.println(dishTypeAndCaloriesLevel);
    }

}
