package chapter5.boxed;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class Boxed {


    public static void main(String[] args) {

        // find the value a^2 * b^2 = int

        List<int[]> intsWithMapToObjectInsteadOfBoxed = IntStream.rangeClosed(1, 50)
                .filter(b -> b % 2 == 0)
                .mapToObj(b -> new int[]{b}).collect(Collectors.toList());

       // intsWithMapToObjectInsteadOfBoxed.forEach(t-> System.out.println(t[0]));

        List<int[]> intsWithBoxed = IntStream.rangeClosed(1, 50)
                .filter(b -> b % 2 == 0)
                .boxed()
                .map(b -> new int[]{b}).collect(Collectors.toList());


        System.out.println("Size of list it means the list contains  :"+ intsWithBoxed.size() + " Array of int");

        intsWithBoxed.forEach(t-> System.out.println(t[0]));

    }


}
