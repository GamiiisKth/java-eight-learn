package chapter3.reference.constructorReferences;

import chap1.Apple;

import java.util.function.Supplier;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class ConstructorReferences {

    //You can create a reference to an existing constructor using its name and the keyword new as follows: ClassName::new

    // this is the way to create a instance of apple with default constructor which it don't take any parameter
    static Supplier<chap1.Apple> appleSupplier = chap1.Apple::new;

    // for constructor with parameter we should create a new functional interface
    static CreateAppleFunctionalInterface<String, Integer, Integer, Apple> appleFunctionalInterface = Apple::new;


    public static void main(String[] args) {

        System.out.println("CREATE APPLE BY SUPPLIER");
        Apple apple1 = appleSupplier.get();
        apple1.setColor("black");
        apple1.setId(1);
        apple1.setWeight(540);

        System.out.println(apple1);


        System.out.println("CREATE APPLE BY OWN FUNCTIONAL INTERFACE");

        Apple apple2=appleFunctionalInterface.apply("green",2,40);
        System.out.println(apple2);

        /**
         * or create Apple from the database
         */


    }


    @FunctionalInterface
    private interface CreateAppleFunctionalInterface<Color, Weight, Id, Apple> {

        Apple apply(Color color, Id id, Weight weight);
    }
}
