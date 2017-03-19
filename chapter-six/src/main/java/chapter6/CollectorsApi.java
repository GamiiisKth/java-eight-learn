package chapter6;

import chapter4.core.Dish;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class CollectorsApi {


    public static void main(String[] args) {
        maximum();
        summingIntValue();
        averageValue();
        summarizingDishesValue();
        joiningStrings();
    }


    private static void maximum() {
        /**
         * These two collectors take a Comparator as argument to compare the elements in the
         stream. Here you create a Comparator comparing dishes based on their calorie content and pass it to Collectors.maxBy:
         */

        //1 finding maximum and minimum

        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);

        // both have same behaviour
        Optional<Dish> dishOptional = Dish.menu.stream().collect(Collectors.maxBy(dishCaloriesComparator));
        Optional<Dish> dishOptional2 = Dish.menu.stream().max(dishCaloriesComparator);

        dishOptional.ifPresent(System.out::println);
        dishOptional2.ifPresent(System.out::println);
    }

    // Summarization

    // how about if we want to summing all the dishes calories
    private static void summingIntValue() {

        // both have same behaviour
        int intSummaryStatistics = Dish.menu.stream().collect(Collectors.summingInt(Dish::getCalories));
        int intSummaryStatistics2 = Dish.menu.stream().mapToInt(Dish::getCalories).sum();

        System.out.println(intSummaryStatistics);
        System.out.println(intSummaryStatistics2);
    }

    // how about if we want to average  dishes calories
    private static void averageValue() {

        double averageStatistics = Dish.menu.stream().collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(averageStatistics);

    }

    // but there is some method which Summarizing all the methods we have introduced above
    // sum , average , maximum ,minimum , count

    private static void summarizingDishesValue() {

        IntSummaryStatistics intSummaryStatistics = Dish.menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));

        System.out.println(intSummaryStatistics);
    }

    //concatenates into a single string all strings resulting from invoking the toString method on each object in the stream
    private static void joiningStrings() {
        String shortMenu = Dish.menu.stream().map(Dish::getName).collect(Collectors.joining(", "));
        System.out.println(shortMenu);
    }


}
