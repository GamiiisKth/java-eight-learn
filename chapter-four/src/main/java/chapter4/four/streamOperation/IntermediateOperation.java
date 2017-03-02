package chapter4.four.streamOperation;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@konsult-folksam.se>}
 */
public class IntermediateOperation {
    /**
     * Intermediate operations such as filter or sorted return another stream as the return type. This
     allows the operations to be connected to form a query. What’s important is that intermediate
     operations don’t perform any processing until a terminal operation is invoked on the stream
     pipeline—they’re lazy. This is because intermediate operations can usually be merged and
     processed into a single pass by the terminal operation.
     */

    /**
     * Terminal operations produce a result from a stream pipeline. A result is any nonstream value
     such as a List, an Integer, or even void. For example, in the following pipeline, forEach is a
     terminal operation that returns void and applies a lambda to each dish in the source. Passing
     System.out.println to forEach asks it to print every Dish in the stream created from menu:
     */


    //###########################################SUMMARY#############################################
    /**
     * To summarize, working with streams in general involves three items:
      A data source (such as a collection) to perform a query on
      A chain of intermediate operations that form a stream pipeline
      A terminal operation that executes the stream pipeline and produces a result
     */

    /**
     * Operation Type           ReturnType  Argument of the operation FunctionDescriptor
     *
     *  filter  Intermediate      Stream<T>   Predicate<T>     T -> boolean

          map   Intermediate    Stream<R>  Function<T, R>        T -> R

        limit      Intermediate     Stream<T>

         sorted     Intermediate    Stream<T> Comparator<T>        (T, T) -> int

        distinct    Intermediate    Stream<T>
     */




}
