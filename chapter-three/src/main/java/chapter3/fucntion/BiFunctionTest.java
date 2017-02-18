package chapter3.fucntion;

import chap1.Apple;

import java.util.function.BiFunction;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class BiFunctionTest {


    private static BiFunction<Apple, Apple, Integer> compareWeight = Apple::compareTo;
    private static CreateAppleByFunction<String, Integer, Integer, Apple> createAppleByFunction = Apple::new;

    public static void main(String[] args) {

        Apple a1 = new Apple("green", 120, 1);
        Apple a2 = new Apple("green", 150, 2);


        System.out.println(compareWeight.apply(a1, a2));

        Apple a3 = createAppleByFunction.apply("green ", 200, 3);

        System.out.println(compareWeight.apply(a3,a1));

        System.out.println(compareWeight.apply(createAppleByFunction.apply("green ", 200, 4), a3));

    }

}
