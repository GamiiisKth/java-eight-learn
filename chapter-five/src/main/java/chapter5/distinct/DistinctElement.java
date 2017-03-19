package chapter5.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class DistinctElement {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 3, 2, 1, 56, 7, 7, 9, 9, 2, 1);


        // distinct it will use equal hashcode to find the distinct even number in the list
       Set<Integer> distinctInteger= list.stream().filter(i -> i % 2 == 0).distinct().collect(Collectors.toSet());

        System.out.println(distinctInteger);



    }
}
