package chapter6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chapter4.core.Dish;
import chapter6.Example.*;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class CollectResult {

    public static List<Example.Transaction> transactions = Arrays.asList( new Transaction(Currency.EUR, 1500.0),
            new Transaction(Currency.USD, 2300.0),
            new Transaction(Currency.GBP, 9900.0),
            new Transaction(Currency.EUR, 1100.0),
            new Transaction(Currency.JPY, 7800.0),
            new Transaction(Currency.CHF, 6700.0),
            new Transaction(Currency.EUR, 5600.0),
            new Transaction(Currency.USD, 4500.0),
            new Transaction(Currency.CHF, 3400.0),
            new Transaction(Currency.GBP, 3200.0),
            new Transaction(Currency.USD, 4600.0),
            new Transaction(Currency.JPY, 5700.0),
            new Transaction(Currency.EUR, 6800.0) );


    // in this class we will grouping every Currency transactions

    private static Map<Currency,List<Transaction>> currencyByTransaction= transactions.stream()
            .collect(Collectors.groupingBy(Transaction::getCurrency));


    public static void main(String[] args) {

        System.out.println(currencyByTransaction);

        System.out.println(Dish.menu.stream().collect(Collectors.counting()));
        System.out.println(Dish.menu.stream().count());


    }


}
