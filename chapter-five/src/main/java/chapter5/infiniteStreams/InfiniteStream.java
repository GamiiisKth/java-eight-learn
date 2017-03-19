package chapter5.infiniteStreams;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class InfiniteStream {




    public static void main(String[] args) {

    // generate 10 even number with help of iterator
        //generateEvenNumberByIterate(10);

       // generateFibonacciSeriesByIterate(20);

        generateRandomByGenerator(5);


    }


    private static void generateEvenNumberByIterate(int size){

        Stream.iterate(0,n-> n+2)
                .limit(size)
                .forEach(System.out::println);
    }

    private static void generateFibonacciSeriesByIterate(int seriesSize) {

        // iterate apply successively a function on each new produced value.
        Stream.iterate(new int[]{0, 1},  t -> new int[]{t[1], t[0]+t[1]})
                .limit(seriesSize)
                .forEach(t -> System.out.println("(" + t[0] + ", " + t[1] + "),"));

    }

    private static void generateRandomByGenerator(int size){

        List<UUID> doubleList = Stream.generate(UUID::randomUUID)
                .limit(size)
                .collect(Collectors.toList());

        doubleList.forEach(System.out::println);
    }


}
