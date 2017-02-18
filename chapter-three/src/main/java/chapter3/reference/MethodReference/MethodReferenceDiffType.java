package chapter3.reference.MethodReference;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class MethodReferenceDiffType {

    // There are three main kinds of method references

    /**
     * 1. A method reference to a static method (for example, the method parseInt of Integer, written Integer::parseInt)
     * 2. A method reference to an instance method of an arbitrary type (for example, the method length of a String,
     * written String::length)
     *
     * 3. A method reference to an instance method of an existing object (for example, suppose you have
     * a local variable expensiveTransaction that holds an object of type Transaction,
     * which supports an instance method getValue; you can write expensiveTransaction::getValue)
     */

    private static List<String> charachters= Arrays.asList("A","b","c","f","e","d");
    public static void main(String[] args) {

        charachters.sort((s1,s2)->s1.compareToIgnoreCase(s2));

        System.out.println("1\n");
        charachters.forEach(System.out::print);
        System.out.println();


        System.out.println("2\n");
        charachters.sort(String::compareToIgnoreCase);
        charachters.forEach(System.out::print);




    }

}
