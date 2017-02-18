package chapter3.typeInference;

import chap1.Apple;

import java.util.List;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class TypeInference {

    /**
     * se the different
     * a -> "green".equals(a.getColor()) and (Apple apple) -> "green".equals(apple.getColor())
     * <p>
     * the different is  a -> "green" ... you don't need to create  (Apple apple) -> "green".
     * <p>
     * because the java compiler will decide the type parameter List<Apple> the type is Apple
     */

    private static List<Apple> applesByPassedPredicate =
            Apple.filterApplesByPassedPredicate(Apple.apples, a -> "green".equals(a.getColor()));

    private static List<Apple> applesByPassedPredicate2 =
            Apple.filterApplesByPassedPredicate(Apple.apples, (Apple apple) -> "green".equals(apple.getColor()));


    public static void main(String[] args) {

        applesByPassedPredicate.forEach(System.out::println);

        applesByPassedPredicate2.forEach(System.out::println);
    }
}
