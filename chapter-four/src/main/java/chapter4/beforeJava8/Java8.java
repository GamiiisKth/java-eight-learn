package chapter4.beforeJava8;

import chapter4.core.Dish;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */

/**
 * filter—Takes a lambda to exclude certain elements from the stream. In this case, you select dishes
 that have more than 300 calories by passing the lambda d -> d.getCalories() > 300.

  map—Takes a lambda to transform an element into another one or to extract information. In this case,
 you extract the name for each dish by passing the method reference Dish::getName, which is
 equivalent to the lambda d -> d.getName().

  limit—Truncates a stream to contain no more than a given number of elements.

  collect—Converts a stream into another form. In this case you convert the stream into a list. It looks
 like a bit of magic; we describe how collect works in more detail in chapter 6. At the moment, you can
 see collect as an operation that takes as an argument various recipes for accumulating the elements of
 a stream into a summary result. Here, toList() describes a recipe for converting a stream into a list.
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
