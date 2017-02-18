package chapter3.fucntion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class FunctionTest {


    public static void main(String[] args) {

        //                                            List<T>                 T      R
        List<Integer> result = map(Arrays.asList("ali", "dunya", "nahida"), String::length);

        

        result.forEach(System.out::println);
    }

    // take the T and apply the R on it  and then return the map result
    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {

        if (list == null) {
            return null;
        }
        List<R> result = new ArrayList<R>();

        for (T t : list) {
            result.add(function.apply(t));
        }

        return result;
    }
}
