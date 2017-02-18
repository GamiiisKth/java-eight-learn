package chapter3.sort;

import chap1.Apple;

import java.util.Comparator;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class ComposingComparators {

    public static void main(String[] args) {

        System.out.println("ascending");
        // this a way how we sort the apple by ascending order
        Apple.apples.sort(Comparator.comparing(Apple::getWeight));
        Apple.apples.forEach(System.out::println);

        System.out.println("descending");
        // but how if we want to sort the apples by decreasing order
        Apple.apples.sort(Comparator.comparing(Apple::getWeight).reversed());
        Apple.apples.forEach(System.out::println);


        //!!!!!!!!!!!!!!!IMPORTANT
        /**
         * Chaining Comparators
         *
         * what if we want to sort the apple first by the weight then by the color and ...
         * this is means a chain of comparing
         */

        System.out.println("Chaining Comparator");
        Apple.apples.sort(Comparator.comparing(Apple::getWeight)
                .thenComparing(Apple::getColor)
        );

        Apple.apples.forEach(System.out::println);




    }
}
