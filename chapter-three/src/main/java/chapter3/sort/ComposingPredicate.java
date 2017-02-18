package chapter3.sort;

import chap1.Apple;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */


public class ComposingPredicate {

    // we know the Apple have a filter method with argument list and predicate

    //Here we will show to how create a composing predicate and have to use *negate and or *


    static Predicate<Apple> greenApplesPredicate =(a)->a.getColor().equals("green");
    static Predicate<Apple> notGreenApplesPredicate = greenApplesPredicate.negate();
    static Predicate<Apple> notGreenApplesAndHeavyPredicate = greenApplesPredicate.negate().and((a)-> a.getWeight()>150);


    public static void main(String[] args) {

        System.out.println("Green apples");
        // sort by green apples
        List<Apple> greenApples=Apple.filterApplesByPassedPredicate(Apple.apples,greenApplesPredicate);
        greenApples.forEach(System.out::println);


        System.out.println("\nNot green Apples");
        List<Apple> notGreenApples=Apple.filterApplesByPassedPredicate(Apple.apples,notGreenApplesPredicate);
        notGreenApples.forEach(System.out::println);


        System.out.println("\nNot green  and heavy apples");
        List<Apple> notGreenApplesAndHeavy=Apple.filterApplesByPassedPredicate(Apple.apples,notGreenApplesAndHeavyPredicate);
        notGreenApplesAndHeavy.forEach(System.out::println);

    }
}
