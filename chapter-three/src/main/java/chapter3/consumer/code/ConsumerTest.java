package chapter3.consumer.code;

import java.util.function.Consumer;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 *
 * Consumer interface represents an operation that accepts a single input argument and returns no result.
 */
public class ConsumerTest {


    public static void main(String[] args) {

        Consumer<String> consumer= ConsumerTest::printName;
        consumer.accept("ali");
        consumer.accept("dennis");
        consumer.accept("hej");

    }


    private static void printName(String s ){
        System.out.println(s);
    }
}
