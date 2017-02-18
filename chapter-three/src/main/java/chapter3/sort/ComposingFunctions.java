package chapter3.sort;

import java.util.function.Function;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class ComposingFunctions {

    // se page 95


   static Function<String,String> addheader=Letter::addHeader;
    //andThen
    static Function<String,String>transformationPipline=
            addheader.andThen(Letter::checkSpelling)
            .andThen(Letter::addFooter);

    public static void main(String[] args) {

        System.out.println(transformationPipline.apply("Welcome to the java8"));
    }




    public static class Letter {
        public static String addHeader(String text) {
            return "From Raoul, Mario and Alan: " + text;
        }

        public static String addFooter(String text) {
            return text + " Kind regards";
        }

        public static String checkSpelling(String text) {
            return text.replaceAll("labda", "lambda");
        }
    }

}
