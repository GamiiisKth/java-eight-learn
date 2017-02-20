package chapter4.three.one;

import chapter4.core.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@konsult-folksam.se>}
 */
public class TraversableOnlyOnce {

    /**
     * Traversable only once
     *
     * a stream can be traversed only once. After that a stream is said
     to be consumed. You can get a new stream from the initial data source to traverse it again just
     like for an iterator (assuming it’s a repeatable source like a collection; if it’s an I/O channel,
     you’re out of luck). For example, the following code would throw an exception indicating the
     stream has been consumed:
     */

    public static void main(String[] args) {

        List<String> test= Arrays.asList("a","c","d","e","f");

        Stream<String> lists=test.stream();

        lists.forEach(System.out::println);


        // Exception in thread "main" java.lang.IllegalStateException:
        //stream has already been operated upon or closed
        //because we have already traversed the stream
        lists.forEach(System.out::println);
    }
}
