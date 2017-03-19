package chapter5.match;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class MatchClass {

    public static void main(String[] args) {

        List<Integer> randomIntegers = new ArrayList<>();

        Random random = new Random();


        IntStream.rangeClosed(1, 10000).forEach((i) -> randomIntegers.add(random.nextInt()));

        Optional<Integer> j = randomIntegers.parallelStream().filter((i) -> i % 2 == 0).skip(100).findAny();

        j.ifPresent(System.out::println);

        long count = randomIntegers.parallelStream().filter((i) -> i % 2 == 0).count();

        System.out.println(count);

        List<Integer> oddsNumber = new ArrayList<>();
        List<Integer> evenNumber = new ArrayList<>();

        /*randomIntegers.parallelStream().forEach((i) -> {

        })
*/

    }
}

