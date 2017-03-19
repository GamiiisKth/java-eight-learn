package chapter5.streamOfstream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class StreamOfStream {

    /**
     * in this example we will use pythagoras math definition to found the to value a^2 * b^2 = C^2
     * but first we need to decide a^2 * b^2= int
     */

    //the code will have two range/foreach of int (a) and (b) . foreach a we will test with all b
    public static void main(String[] args) {

        Stream<int[]> possiblePythagoras = IntStream.rangeClosed(1, 50)
                .boxed()
                .flatMap(a ->

                        IntStream.rangeClosed(a, 50)
                                .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                                .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)})

                );

       // possiblePythagoras.forEach(v -> System.out.println("{" + v[0]+ "," +v[1]+ ","+ v[2]+"}"));



    //!!!!!!!!!!!!!!!! WHY  flatMap , just because every (a) is a stream and IntStream.rangeClosed(a, 50) return stream then we
    // have stream of stream so with help of flatMap we will reduce to one stream


    // ####################################### what Can we do better #################################
    // as you se we calculate Math.sqrt(a * a + b * b) twice, better solution is

    Stream<double[]> possiblePythagorasWithBetterPerformance  = IntStream.rangeClosed(1, 50)
            .boxed()
            .flatMap(a ->

                    IntStream.rangeClosed(a, 50)
                            .mapToObj(b -> new double[]{a, b, Math.sqrt(a * a + b * b)})
                            .filter(t -> t[2] %1== 0));

        possiblePythagorasWithBetterPerformance.forEach(v -> System.out.println("{" + v[0]+ "," +v[1]+ ","+ v[2]+"}"));

    }
}
