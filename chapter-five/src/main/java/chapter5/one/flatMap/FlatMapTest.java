package chapter5.one.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class FlatMapTest {

    // we will try to find the deictic character
    public static void main(String[] args) {

        findDistinct();


    }


    private static void findDistinct() {
        String[] stringsOfArrays = {"GoodBye", "word"};

        // convert whole the array to stream
        Stream<String> characters = Arrays.stream(stringsOfArrays);


        List<String> distinct =
                // convert each word which has been split by "" to array -> [Goodbye] [word]
                characters.map(word -> word.split(""))
                        // make each array to separate stream
                        .flatMap(Arrays::stream)
                        // find the distinct of each array
                        .distinct()
                        // merge or collect the result to a list
                        .collect(toList());

        System.out.println(distinct);

    }
}
