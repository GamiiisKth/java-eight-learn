package chapter4.three.two;

import chapter4.core.Dish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@konsult-folksam.se>}
 */
public class ExternalAndInternal {


    /**
     * Using the Collection interface requires iteration to be done by the user (for example, using
     * for-each); this is called external iteration. The Streams library by contrast uses internal
     * iteration—it does the iteration for you and takes care of storing the resulting stream value
     * somewhere; you merely provide a function saying what’s to be done. The following code listings
     * illustrate this difference.
     */
    public static void main(String[] args) {

        System.out.println("**************************external************************");
        externalIteration();

        System.out.println("************************internal**************************");
        internalIteration().forEach(System.out::println);
    }


    private static void externalIteration() {

        Iterator<Dish> iterator = Dish.menu.iterator();

        while (iterator.hasNext()) {
            Dish dish = iterator.next();
            System.out.println(dish.getName());
        }
    }

    private static List<String> internalIteration() {
        // map will iterate for you
        List<String> dishes = Dish.menu.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());

        return dishes;
    }

}
