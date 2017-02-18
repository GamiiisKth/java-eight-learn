package chapter3.reference.MethodReference;

import chap1.Apple;

import java.util.Comparator;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */

// read page 85-...
public class GroundOfMethodReference {

    public static void main(String[] args) {

        /**
         * sort the application based on requirement
         * Apple::getWeight
         * or getColor
         *
         */

        Apple.apples.sort(Comparator.comparing(Apple::getId));
        Apple.apples.forEach(System.out::println);


        /**
         * instead of
         * iApple.apples.sort((Apple a1, Apple a2)-> a1.getWeight().compareTo(a2.getWeight()));
         *
         * we can use method reference
         Apple.apples.sort(Comparator.comparing(Apple::getId));
         */
    }
}
